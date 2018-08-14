package com.laibao.functionintroduction;

import com.laibao.functionintroduction.recursion.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author laibao wang
 * @date 2018-08-15
 * @version 1.0
 */
public class TreeRecursionTest {

    @Test
    public void walkATree() {
        Tree root = new Tree(
                new Tree(
                        new Tree(null, 3, null), 2, new Tree(new Tree(null, 5, null), 4, null)),
                1,
                new Tree(
                        new Tree(null, 7, null), 6, new Tree(null, 8, null)));
        String expected = "(((^-3-^)-2-((^-5-^)-4-^))-1-((^-7-^)-6-(^-8-^)))";
        assertEquals(expected, root.toString());
    }
}
