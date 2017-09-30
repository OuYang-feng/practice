package com.newCood;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFS {
    private char[] vertices;//顶点集合
    private int[][] arcs;//邻接矩阵
    private int vexnum;//顶点总数
    private boolean[] visited;//是否遍历
    public DFS(int n){
        vexnum = n;
        vertices = new char[n];
        arcs = new int[n][n];
        visited = new boolean[n];
        for (int i = 0; i < vexnum; i++) {
            for (int j = 0; j < vexnum; j++) {
                arcs[i][j] = 0;
            }
        }
    }

    public void addEdge(int i, int j){
        if (i==j)return;

        arcs[i][j] = 1;
        arcs[j][i] = 1;
    }

    public void setVertices(char[] vertices){
        this.vertices = vertices;
    }
    public void setVisited(boolean[] visited){
        this.visited = visited;
    }
    private void visit(int i){
        System.out.println(vertices[i]+" ");
    }

    //从第i个节点开始深度优先遍历
    private void traverse(int i){
        visited[i] = true;
        visit(i);
        for (int j = 0; j < vexnum; j++) {
            if (arcs[i][j]==1&&!visited[j]){
                traverse(j);
            }
        }
    }
    //图的深度优先遍历(递归)
    public void DFSTraverse(){
        for (int i = 0; i < vexnum; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < vexnum; i++) {
            if (!visited[i]){
                traverse(i);
            }
        }
    }

    //图的深度优先遍历（非递归）

    public void DFSTraverse2(){
        for (int i = 0; i <vexnum ; i++) {
            visited[i] = false;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < vexnum; i++) {
            if (!visited[i]){
                stack.add(i);
                do {
                    int curr = stack.pop();
                    if (!visited[curr]){
                        visit(curr);
                        visited[curr] = true;

                        for (int j = vexnum-1; j >0 ; j--) {
                            if (arcs[curr][j]==1&&!visited[j]){
                                stack.add(j);
                            }
                        }
                    }
                }while (!stack.isEmpty());

            }
        }
    }
    //广度优先遍历

    public void BFS(){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < vexnum; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < vexnum; i++) {
            if (!visited[i]){
                queue.add(i);
                visited[i] = true;
                System.out.println(visited[i]+" ");
                while (!queue.isEmpty()){
                    int row = queue.remove();
                    for (int j = firstAdjVex(row); j >=0 ; j = nextAdjVex(row,j)) {
                        if (!visited[j]){
                            queue.add(j);
                            visited[j] = true;
                            System.out.println(visited[j]+" ");
                    }
                }

                }
            }
        }
    }

    private int firstAdjVex(int row){
        for (int i = 0; i < vexnum ; i++) {
            if (arcs[row][i]==1)
                return i;
        }
        return -1;
    }
    private int nextAdjVex(int row,int k){
        for (int i = k + 1; i < vexnum; i++) {
            if (arcs[row][i]==1){
                return i;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
        DFS g = new DFS(9);
        char[] vertices = {'A','B','C','D','E','F','G','H','I'};

        g.setVertices(vertices);

        g.addEdge(0,1);//输入边信息
        g.addEdge(0,5);


        g.DFSTraverse(); //递归
        g.DFSTraverse2(); //非递归
    }
}
