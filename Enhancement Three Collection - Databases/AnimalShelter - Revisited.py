from pymongo import MongoClient
from pymongo.errors import PyMongoError
from bson.objectid import ObjectId

class AnimalShelter:
    """Enhanced CRUD operations for the Animal collection in MongoDB."""

    def __init__(self, username='aacuser', password='yourpassword',
                 host='nv-desktop-services.apporto.com', port=31892, db='AAC'):
        try:
            self.client = MongoClient(f'mongodb://{username}:{password}@{host}:{port}/{db}?authSource={db}')
            self.database = self.client[db]
            self.collection = self.database['animals']
            self.users = self.database['users']
        except PyMongoError as e:
            print(f"Database connection error: {e}")
            raise

    # CRUD Operations
    def create(self, data):
        if data is not None:
            try:
                result = self.collection.insert_one(data)
                return result.acknowledged
            except PyMongoError as e:
                print(f"Insert error: {e}")
                return False
        else:
            raise ValueError("Data parameter is empty")

    def read(self, criteria=None):
        try:
            if criteria:
                data = self.collection.find(criteria, {"_id": False})
            else:
                data = self.collection.find({}, {"_id": False})
            return list(data)
        except PyMongoError as e:
            print(f"Read error: {e}")
            return []

    def update(self, query, new_values, role='staff'):
        if role != 'admin':
            raise PermissionError("Only admin can update records.")
        try:
            result = self.collection.update_one(query, {'$set': new_values})
            return result.modified_count > 0
        except PyMongoError as e:
            print(f"Update error: {e}")
            return False

    def delete(self, query, role='staff'):
        if role != 'admin':
            raise PermissionError("Only admin can delete records.")
        try:
            result = self.collection.delete_one(query)
            return result.deleted_count > 0
        except PyMongoError as e:
            print(f"Delete error: {e}")
            return False

    # Enhancement 1: Create Index
    def create_index(self, field):
        try:
            index_name = self.collection.create_index([(field, 1)])
            print(f"Index created: {index_name}")
            return index_name
        except PyMongoError as e:
            print(f"Indexing error: {e}")
            return None

    # Enhancement 2: Aggregation Pipeline
    def get_breed_statistics(self):
        try:
            pipeline = [
                {"$match": {"adopted": False}},
                {"$group": {"_id": "$breed", "count": {"$sum": 1}}},
                {"$sort": {"count": -1}}
            ]
            results = self.collection.aggregate(pipeline)
            return list(results)
        except PyMongoError as e:
            print(f"Aggregation error: {e}")
            return []

    # Enhancement 3: User Authentication
    def authenticate_user(self, username, password):
        try:
            user = self.users.find_one({"username": username, "password": password})
            if user:
                return user.get("role", "staff")
            else:
                raise ValueError("Invalid credentials")
        except PyMongoError as e:
            print(f"Authentication error: {e}")
            return None
