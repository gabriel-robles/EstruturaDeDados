package controllers;

import fateczl.gabrielrobles.stack.Stack;

public class ConvertController {
    public String decToBin(int num) {
        var numElements = 1;

        while (num >= Math.pow(2, numElements)) {
            numElements++;
        }

        var stack = new Stack<Integer>(numElements);
        var bin = "";
    
        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }
    
        while (!stack.isEmpty()) {
            bin += stack.pop();
        }
    
        return bin;
    }
}
