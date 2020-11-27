/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.HashMap;
import model.HuffmanTree;
import view.newView;

/**
 *
 * @author Dave Septian
 */
public class PrefixFreeCompression {
//    
//    Declare Class that are going to be used for
//    
    newView View = new view.newView();
    
    
    public void Compression(String inpData){
//        
//        Declaring all the variable that will be used in this class
//        
        System.out.println(inpData);
        char[] charArray = inpData.toCharArray();
        int[] prefixData = null;
        char[] checkedData = new char[charArray.length];
        int[] occurance = new int[checkedData.length];
        int dataSize = inpData.length();
        String prefix = "";
        HashMap<Character, Integer> map = new HashMap<>();
        
//        
//        Looping to check the String given has many uniques characters and occurances
//        
        
//        
//        Sorting the ArrayList karena data yang disimpan variabel occurance dan checkedData urut dengan urutan masuknya
//        
        for(char character : inpData.toCharArray()){
            if(!map.containsKey(character)){
                map.put(character, 1);
            }
            else{
                map.put(character, (map.get(character) + 1));
            }
        }

        pembentukanTrie(map, dataSize);
//
//        Setting up the characters that are going to be converted into ASCII to the JavaTextField
//        
//        
    }
    

    
    public void pembentukanTrie(HashMap<Character, Integer> map, int dataSize){
        //preorder
        
        PriorityQueue<HuffmanTree> queue = new PriorityQueue<HuffmanTree>(dataSize, new controller.MyComparator());
//        
//        for(int i = 0; i < dataSize; i++){
//            for(char j : map.keySet()){
//                HuffmanTree ht = new HuffmanTree();
//                ht.setKarakter(charArray[i]);
//            }
//        }
        
        HashMap<Character, Integer> tree = new HashMap<Character, Integer>();
        HashMap<Character, Integer> checkMap = new HashMap<Character, Integer>();
        
//        ArrayList<HashMap> mapQueue = new ArrayList<HashMap>();
        
//        boolean isFinished = false;
//        boolean isTaken = false;
        
//        while(isFinished == false){
//            int lowest1 = 100, lowest2 = 100;
//            
//            for(char i : map.keySet()){
//                if(map.get(i) < lowest1){
//                    for(char j : tree.keySet()){
//                        if(i == j){
//                            isTaken = true;
//                        }
//                    }
//                    if(isTaken == false){
//                        lowest1 = map.get(i);
//                    }
//                }
//                else{
//                    if(map.get(i) < lowest2){
//                        for(char j : tree.keySet()){
//                            if(i == j){
//                                isTaken = true;
//                            }
//                        }
//                        if(isTaken == false){
//                            lowest2 = map.get(i);
//                        
//                        }
//                    }
//                }
//            }
    //        
    //        The Second For is for inserting the data into the hasmap that will be inserted unto the Huffman Tree
    //        
//            for(char i : map.keySet()){
//                if(map.get(i) == lowest1){
//                    map.put(i, map.get(i));
//                }
//                if(map.get(i) == lowest2){
//                    map.put(i, map.get(i));
//                }
//            }

//            System.out.println(tree);

            for(char i : map.keySet()){
//                checkMap.put(i, tree.get(i));
                HuffmanTree ht = new HuffmanTree();
                ht.setKarakter(i);
                ht.setOccurance(map.get(i));
                ht.setLeft(null);
                ht.setRight(null);
                
                queue.add(ht);
            }
            
            HuffmanTree root = null;
            
            while(queue.size() > 1){
                HuffmanTree x = queue.peek();
                queue.poll();
                
                HuffmanTree y = queue.peek();
                queue.poll();
                
                HuffmanTree z = new HuffmanTree();
                
                z.setOccurance(x.getOccurance() + y.getOccurance());
                z.setKarakter('-');
                z.setLeft(x);
                z.setRight(y);
                
                root = z;
                
                queue.add(z);
            }
            
            printCode(root, "");
            
//            tree.clear();
//            
//            if(map == checkMap){
//                isFinished = true;
//            }
//        }
    }
    
    public void printCode(HuffmanTree root, String s) 
    { 
  
        // base case; if the left and right are null 
        // then its a leaf node and we print 
        // the code s generated by traversing the tree. 
        if (root.getLeft() == null
            && root.getRight() == null
            && Character.isLetter(root.getKarakter())) { 
  
            // c is the character in the node 
            System.out.println(root.getKarakter() + ":" + s); 
  
            return; 
        } 
  
        // if we go to left then add "0" to the code. 
        // if we go to the right add"1" to the code. 
  
        // recursive calls for left and 
        // right sub-tree of the generated tree. 
        printCode(root.getLeft(), s + "0"); 
        printCode(root.getRight(), s + "1"); 
    } 
    
    public void pembentukanPreFixCode(HashMap<Character, Integer> checkMap){
        //Prefix = Root, L, R
        //left=0, right=1
        
        
        
//        HuffmanTree Tree = new model.HuffmanTree(0, 0, true, TreeL, TreeR);
        
    }
    
    public void charToBinary(){
        //char to ASCII
        //https://www.daniweb.com/programming/software-development/threads/477895/ascii-to-binary
        
    }
    
    public void rangkaianFinalDataKompresi(){
        //for(Trie+ASCII) +
    }
    
    public void totalByteTeksSebelumKompresi(){
        //ini mah for aja, ada berapa dataSize
    }
    
    public void totalByteHasilFinalKompresi(){
        //hasilKompresiByte=jumlah banyaknya Byte rangkaianFinalDataKompresi / 8
        //pengemetan persentase = 100-(hasilByte/totalByteTeksSebelumKompresi)*100
        
        
        //penghematan_persentase = 100-(totalByteTeksSebelumKompresi/hasilKompresiByte)*100
        //return penghematan_persentase
    }
}
