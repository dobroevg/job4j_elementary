package dzSemChetyreSvoy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void MyArrayListConstructor1() {
        var array = new MyArrayList<>();
        Assert.assertEquals(10, array.getCapacity());
        Assert.assertEquals("", array.toString());
        Assert.assertEquals(0, array.getSize());
    }

    @Test
    void MyArrayListConstructor2() {
        var array = new MyArrayList<>(5);
        Assert.assertEquals(5, array.getCapacity());
        Assert.assertEquals("", array.toString());
        Assert.assertEquals(0, array.getSize());
    }

    @Test
    void allTask03() {
        var array = new MyArrayList<>(6);
        var sc = new Scanner("a1\nbb2\nccc3\ndddd4\neeeee5\n");
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            array.pushBack(str);
        }
        Assert.assertEquals(6, array.getCapacity());
        Assert.assertEquals("a1 bb2 ccc3 dddd4 eeeee5", array.toString());
        Assert.assertEquals(5, array.getSize());
        array.pushFront("f6");
        Assert.assertEquals(6, array.getSize());
        Assert.assertEquals("f6 a1 bb2 ccc3 dddd4 eeeee5", array.toString());
        array.insert(2,"g7");
        Assert.assertEquals("f6 a1 g7 bb2 ccc3 dddd4 eeeee5", array.toString());
        Assert.assertEquals(10, array.getCapacity());
        array.popFront();
        Assert.assertEquals("a1 g7 bb2 ccc3 dddd4 eeeee5", array.toString());
        array.removeAt(2);
        Assert.assertEquals("a1 g7 ccc3 dddd4 eeeee5", array.toString());
        array.insert(3,"g7");
        Assert.assertEquals("a1 g7 ccc3 g7 dddd4 eeeee5", array.toString());
        array.remove("g7");
        Assert.assertEquals("a1 ccc3 g7 dddd4 eeeee5", array.toString());
        array.insert(4,"g7");
        array.removeAll("g7");
        Assert.assertEquals("a1 ccc3 dddd4 eeeee5", array.toString());
        array.popBack();
        Assert.assertEquals("a1 ccc3 dddd4", array.toString());
        array.clear();
        Assert.assertEquals("", array.toString());
        Assert.assertEquals(0, array.getSize());
    }

    @Test
    void allTask04() {
        var array = new MyArrayList<>();
        var sc = new Scanner("a1\nbb2\nccc3\ndddd4\neeeee5\n");
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            array.pushBack(str);
        }
        array.insert(4, "bb2");
        Assert.assertEquals(1, array.indexOf("bb2"));
        Assert.assertEquals(4, array.lastIndexOf("bb2"));
        Assert.assertEquals(-1, array.indexOf("bbb2"));
        Assert.assertEquals(-1, array.lastIndexOf("bb2b"));
        assertFalse(array.isEmpty());
        array.clear();
        assertTrue(array.isEmpty());
        array.trimToSize();
        Assert.assertEquals(array.getSize(), array.getCapacity());
    }

    @Test
    void allTask05() {
        var array = new MyArrayList<>();
        var sc = new Scanner("a1\nbb2\nccc3\ndddd4\neeeee5\n");
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            array.pushBack(str);
        }
        array.reverse();
        Assert.assertEquals("eeeee5 dddd4 ccc3 bb2 a1", array.toString());
        array.reverse();
        Assert.assertEquals("a1 bb2 ccc3 dddd4 eeeee5", array.toString());
        array.popFront();
        array.reverse();
        Assert.assertEquals("eeeee5 dddd4 ccc3 bb2", array.toString());
        array.shuffle();
        assertFalse(array.indexOf("eeeee5") < 0 || array.indexOf("dddd4") < 0 || array.indexOf("ccc3") < 0
                || array.indexOf("bb2") < 0);
        array.shuffle();
        assertFalse(array.indexOf("eeeee5") < 0 || array.indexOf("dddd4") < 0 || array.indexOf("ccc3") < 0
                || array.indexOf("bb2") < 0);
    }

    @Test
    void allTask06() throws CloneNotSupportedException {
        var array = new MyArrayList<>();
        var sc = new Scanner("a1\nbb2\nccc3\ndddd4\neeeee5\n");
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            array.pushBack(str);
        }
        var array1 = new MyArrayList<>();
        var sc1 = new Scanner("a1\nbb2\nccc3\ndddd4\neeeee5\n");
        for (int i = 0; i < 5; i++) {
            String str1 = sc1.nextLine();
            array1.pushBack(str1);
        }
        assertTrue(array.equals(array1));
        array1.insert(2, "f5");
        assertFalse(array.equals(array1));
        Assert.assertEquals("ccc3", array.getElement(2));
        Assert.assertEquals(null, array.getElement(6));
        MyArrayList cloneArray = (MyArrayList) array.clone();
        Assert.assertEquals(array.toString(), cloneArray.toString());
    }
}