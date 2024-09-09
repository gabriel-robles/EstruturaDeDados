package controllers;

import fateczl.gabrielrobles.stack.Stack;

public class ConvertController {
    public String decToBin(int num) {
        var stack = new Stack<Integer>(num);
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
