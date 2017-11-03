package org.springdot.bracer.eval;

import me.andrz.brace.BraceExpansion;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class Test1{

    @Test
    public void testExpander() throws Exception{
        List<String> expand = BraceExpansion.expand("foo-{10..12}");

        for (String s : expand){
            System.out.println(s);
        }

        Assert.assertEquals("wrong number of expansions", 3, expand.size());
    }
}
