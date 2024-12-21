public class HashTableTest {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);


        hashTable.hashtabAdd("key1", "value1");
        hashTable.hashtabAdd("key2", "value2");
        hashTable.hashtabAdd("key3", "value3");
        hashTable.hashtabAdd("key4", "value4");
        hashTable.hashtabAdd("key5", "value5");
        hashTable.hashtabAdd("key6", "value6");
        hashTable.hashtabAdd("key7", "value7");
        hashTable.hashtabAdd("key8", "value8");
        hashTable.hashtabAdd("key9", "value9");
        hashTable.hashtabAdd("key10", "value10");


        System.out.println("Поиск key3: " + hashTable.hashtabLookup("key3"));

        System.out.println("Удаление key3...");
        hashTable.hashtabDelete("key3");
        System.out.println("Поиск key3 после удаления: " + hashTable.hashtabLookup("key3"));

        System.out.println("Содержание таблицы:");
        hashTable.display();
    }
}

