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
import view.simpleView;

/**
 *
 * @author Dave Septian
 */
public class PrefixFreeCompression {
//    
//    Declare Class that are going to be used for
//    
    simpleView View = new view.simpleView();
//    HuffmanTree Tree = new model.HuffmanTree();
    
    public void Compression(){
//        
//        Declaring all the variable that will be used in this class
//        
        String inpData = View.get_txt();
        System.out.println(inpData);
        char[] arrData = inpData.toCharArray();
        int[] prefixData = null;
        int[] occurance = null;
        int dataSize = inpData.length();
        String prefix = "";
        Integer arrHuffmanString[] = new Integer[dataSize];
        ArrayList<Character> checkedData = new ArrayList<Character>();
        
//        
//        Looping to check the String given has many uniques characters and occurances
//        
        for(int i = 0; i < dataSize; i++){
            if(checkedData.size() == 0){
                checkedData.add(arrData[i]);
            }
            for(int j = 0; j < checkedData.size(); j++){
                if (arrData[i] == checkedData.get(j)){
                    occurance[j] += 1;
                }
                else{
                    checkedData.set(j+1, arrData[i]);
                }
            }
        }
//        
//        Setting up the characters that are going to be converted into ASCII to the JavaTextField
//        
        for(int i = 0; i < dataSize; i++){
            prefixData[i] = (int) arrData[i];
            prefix += prefixData[i] + "\n";
        }
        View.setHuffman(prefix);
    }
    
    public HashMap<Character, Integer> initMapCharacter(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char character : text.toCharArray()) {
            if (!map.containsKey(character)) {
                map.put(character, 1);
            } else {
                map.put(character, (map.get(character) + 1));
            }
        }

        return map;
    }
    
    public void pembentukanTrie(){
        //preorder
        
        
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
        //penghematan_persentase = 100-(totalByteTeksSebelumKompresi/hasilKompresiByte)*100
        //return penghematan_persentase
    }
}
