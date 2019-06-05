package org.practischool;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void chenYiWen() {
        assertEquals(App.chenYiWen().toLowerCase(), "chen yi wen");
    }

    @Test
    public void eric() {
        assertEquals(App.eric().toLowerCase(), "eric");
    }

    @Test
    public void liChengJie() {
        assertEquals(App.liChengJie().toLowerCase(), "li cheng jie");
    }

    @Test
    public void liQingSong() {
        assertEquals(App.liQingSong().toLowerCase(), "li qing song");
    }

    @Test
    public void luoMingYang() {
        assertEquals(App.luoMingYang().toLowerCase(), "luo ming yang");
    }
}
