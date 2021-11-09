public interface DatabaseObject {

  void storeInDatabase();

  String toStorageString();

  void fromStorageString(String data);

}
