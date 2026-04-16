/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node,Node> map=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        map=new HashMap<>();
        Node clonenode=new Node(node.val);
        map.put(node,clonenode);
        dfs(node,clonenode,map);
        return clonenode;
    }
    public void dfs(Node node,Node clonenode,Map<Node,Node> map)
    {
        for(Node nei:node.neighbors)
        {
        if(!map.containsKey(nei))
        {
            Node clone_nei=new Node(nei.val);
            map.put(nei,clone_nei);
            clonenode.neighbors.add(clone_nei);
            dfs(nei,clone_nei,map);
        }
        else
        {
            clonenode.neighbors.add(map.get(nei));
        }
        }
    }
}