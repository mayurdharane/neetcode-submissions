class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> characterMap = new HashMap<>();
        characterMap.put(')','(');
        characterMap.put('}','{');
        characterMap.put(']','[');


        for (char c : s.toCharArray()){
            
            if(characterMap.containsKey(c) && !stack.isEmpty()  && stack.peek() == characterMap.get(c)){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
