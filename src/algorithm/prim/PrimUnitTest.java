package algorithm.prim;

import java.util.ArrayList;

import java.util.List;

import org.junit.Test;

public class PrimUnitTest {

	@Test
	public void givenAGraph_whenPrimRuns_thenPrintMST() {
		Prim prim = new Prim(createGraph());
		System.out.println(prim.originalGraph());
		System.out.println("----------------");
		prim.run();
		System.out.println();
		prim.resetPrintHistory();
		System.out.println(prim.minimumSpanningTree());
	}

	public static List<Vertex> createGraph() {
		List<Vertex> graph = new ArrayList<>();
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		Vertex g = new Vertex("G");

		Edge ab = new Edge(1);
		a.addEdge(b, ab);
		b.addEdge(a, ab);

		Edge ac = new Edge(2);
		a.addEdge(c, ac);
		c.addEdge(a, ac);

		Edge ad = new Edge(5);
		a.addEdge(d, ad);
		c.addEdge(a, ad);

		Edge bc = new Edge(1);
		b.addEdge(c, bc);
		c.addEdge(b, bc);

		Edge cd = new Edge(2);
		c.addEdge(d, cd);
		d.addEdge(c, cd);
		
		Edge ce = new Edge(3);
		c.addEdge(e, ce);
		e.addEdge(c, ce);
		
		Edge de = new Edge(2);
        d.addEdge(e, de);
        e.addEdge(d, de);
        
        Edge dg = new Edge(4);
        d.addEdge(g, dg);
        g.addEdge(d, dg);
        
        Edge df = new Edge(3);
        d.addEdge(f, df);
        f.addEdge(d, df);
        
        Edge af = new Edge(5);
        a.addEdge(f, af);
        f.addEdge(a, af);
        
        Edge fg = new Edge(3);
        f.addEdge(f, fg);
        g.addEdge(d, fg);
        
        Edge eg = new Edge(1);
        g.addEdge(g, eg);
        e.addEdge(e, eg);
		
		graph.add(a);
		graph.add(b);
		graph.add(c);
		graph.add(d);
		graph.add(e);
		return graph;
	}

}
