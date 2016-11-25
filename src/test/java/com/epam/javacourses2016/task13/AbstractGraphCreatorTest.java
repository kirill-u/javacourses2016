package com.epam.javacourses2016.task13;

import org.testng.annotations.Test;

import java.util.Map;

public class AbstractGraphCreatorTest {
    @Test
    public void testCreateGraph() throws Exception {
        MyGraphCreator creator = new MyGraphCreator();
        AbstractGraphCreator.MyGraph graph = creator.createGraph(10);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        for (Map.Entry<Integer, AbstractGraphCreator.MyGraph.Node> node : graph.getNodes().entrySet()) {
            System.out.print("NodeValue: " + node.getKey() + "; ChildValues: ");
            for (AbstractGraphCreator.MyGraph.Node child : node.getValue().getConnectedNodes()) {
                System.out.print(child.value + "; ");
            }
            System.out.println();
        }
        int x = 5;
    }
}