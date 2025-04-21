from pymongo import MongoClient
from pymongo.errors import PyMongoError

class AnimalShelter:
    """CRUD operations for the Animal collection in MongoDB."""
    
    def __init__(self, username='aacuser', password='yourpassword', host='nv-desktop-services.apporto.com', port=31892, db='AAC'):
        """
        Initialize the MongoDB client and connect to the specified database and collection.
        
        Parameters:
        - username: MongoDB username
        - password: MongoDB password
        - host: Host address for MongoDB
        - port: Port number for MongoDB
        - db: Database name
        """
        self.client = MongoClient(f'mongodb://{username}:{password}@{host}:{port}/{db}?authSource={db}')
        self.database = self.client[db]
        self.collection = self.database['animals']  # Specify the collection

    def create(self, data):
        """
        Insert a document into the collection.
        
        Parameters:
        - data: Dictionary containing the key/value pairs to insert
        
        Returns:
        - True if the insert is successful, otherwise False
        """
        if data is not None:
            try:
                insert_result = self.collection.insert_one(data)  # Use insert_one instead of insert
                return insert_result.acknowledged  # Returns True if the insert was acknowledged
            except PyMongoError as e:
                print(f"An error occurred while inserting the document: {e}")
                return False
        else:
            raise ValueError("Nothing to save, because the data parameter is empty")
    
    def read(self, criteria=None):
        """
        Query documents from the collection.
        
        Parameters:
        - criteria: Dictionary containing the key/value pairs for the query
        
        Returns:
        - List of documents that match the query, or an empty list if no match
        """
        try:
            if criteria is not None:
                data = self.collection.find(criteria, {"_id": False})  # Exclude _id field in results
            else:
                data = self.collection.find({}, {"_id": False})  # Get all documents, excluding _id

            return list(data)  # Convert cursor to a list
        except PyMongoError as e:
            print(f"An error occurred while querying the documents: {e}")
            return []