class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for(String comp : components){
            if(comp.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(!comp.equals(".") && !comp.equals("")){
                stack.push(comp);
            }
        }    
        return "/" + String.join("/", stack);    
    }
}