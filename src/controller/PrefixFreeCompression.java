/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.awt.List;
import java.util.ArrayList;
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
//    HuffmanTree Tree = new model.HuffmanTree();
    
    public void Compression(String inpData){
//        
//        Declaring all the variable that will be used in this class
//        
//        String inpData = View.get;
        System.out.println(inpData);
//        char[] arrData = inpData.toCharArray();
        int[] prefixData = null;
//        int[] occurance = null;
//        ArrayList<Integer> occurance = new ArrayList<Integer>();
        int dataSize = inpData.length();
        String prefix = "";
        HashMap<Character, Integer> map = new HashMap<>();
//        Integer arrHuffmanString[] = new Integer[dataSize];
//        ArrayList<Character> checkedData = new ArrayList<Character>();
        
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

        pembentukanTrie(map);
//
//        Setting up the characters that are going to be converted into ASCII to the JavaTextField
//        
//        
    }
    

    
    public void pembentukanTrie(HashMap<Character, Integer> map){
        //preorder
        
        HashMap<Character, Integer> tree = new HashMap<Character, Integer>();
        HashMap<Character, Integer> checkMap = new HashMap<Character, Integer>();
        
        int lowest1 = 100, lowest2 = 100;
        boolean isFinished = false;
        
        while(isFinished == false){
            for(char i : map.keySet()){
                if(map.get(i) < lowest1){
                    lowest1 = map.get(i);
                }
                else{
                    if(map.get(i) < lowest2){
                        lowest2 = map.get(i);
                    }
                }
            }
    //        
    //        The Second For is for inserting the data into the hasmap that will be inserted unto the Huffman Tree
    //        
            for(char i : map.keySet()){
                if(map.get(i) == lowest1){
                    tree.put(i, map.get(i));
                }
                if(map.get(i) == lowest2){
                    tree.put(i, map.get(i));
                }
            }

            System.out.println(tree);

            for(char i : tree.keySet()){
                checkMap.put(i, tree.get(i));
            }

            tree.clear();
            
            if(map == checkMap){
                isFinished = true;
            }
        }
    }
    
    public void pembentukanPreFixCode(){
        //Prefix = Root, L, R
        //left=0, right=1
        
        
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
