package com;

import java.util.*;
public class Graph {
    int V;
    private LinkedList<Integer> adj[];
    Graph(int v){
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;++i)
            adj[i]=new LinkedList();
    }
    void Bfs(int s) {
        boolean visited[]=new boolean[V];
        LinkedList<Integer> q=new LinkedList<Integer>();
        visited[s]=true;
        q.add(s);
        while(q.size()!=0) {
            s=q.poll();
            System.out.println(s+" ");
            Iterator<Integer> i=adj[s].listIterator();
            while(i.hasNext()) {
                int n=i.next();
                if(!visited[n]) {
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }
    void addEdge(int v,int w) {
        adj[v].add(w);
    }
    public static void main(String args[]) {
        Graph g=new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        g.Bfs(1);
    }
}


/*
4 nodess
0 --- 1
[    [
[  [
2 [
[
[
3


 */