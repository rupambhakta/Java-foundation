public class HashMapImplimentation {
    static class MyHashMap<k, v> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            k key;
            v value;
            Node( k key, v value){
                this.key = key;
                this.value =value;
            }
        }


        public int size(){
            //Retuen the number of entries in map
            return 0;
        }

        public void put(k key, v value){
            
        }
    }

    public static void main(String[] args) {
        MyHashMap<String,Integer> mp = new MyHashMap<>();
        //Wirte a code to put data on mp 

        
    }
}
