/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Comparator;
import model.HuffmanTree;

/**
 *
 * @author Dave Septian
 */
class MyComparator implements Comparator<HuffmanTree> {
    @Override
    public int compare(HuffmanTree x, HuffmanTree y) 
    {
        return x.getOccurance() - y.getOccurance(); 
    } 
} 
