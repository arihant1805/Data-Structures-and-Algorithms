public class Trieds {
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root = new Node();
    //Creating the Trie
    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    //Searching in Trie
    public static boolean search(String word){
        Node curr=root;
         for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            if(i==word.length()-1){
                return curr.children[idx].eow==true;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String []args){
        String words[]={"the","a","there","their","any"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("the"));
        System.out.println(search("thre"));
    }
}
