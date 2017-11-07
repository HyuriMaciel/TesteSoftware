import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        int i6 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test02");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        hrqueue_comparable_str1.clear();
        boolean b4 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b6 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test03");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.clear();
        int i5 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test04");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.clear();
        int i3 = hrqueue_comparable_str1.size();
        boolean b5 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.clear();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test05");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.clear();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.clear();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.clear();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test06");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.clear();
        boolean b6 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test07");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.clear();
        boolean b11 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test08");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        int i4 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b9 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        boolean b12 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b13 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.front();
        boolean b16 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str17 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str18 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "" + "'", comparable_str18.equals(""));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test09");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        boolean b4 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test10");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.clear();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        boolean b10 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test11");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        int i4 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.clear();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        boolean b8 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        boolean b14 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(comparable_str15);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test12");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        int i4 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.clear();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        boolean b8 = hrqueue_comparable_str1.push(comparable_str7);
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        int i11 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test13");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.clear();
        int i3 = hrqueue_comparable_str1.size();
        boolean b5 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.clear();
        boolean b8 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        boolean b12 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test14");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 1);
        int i2 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.clear();
        boolean b4 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test15");
        br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste2.HRQueue<java.lang.Comparable<java.lang.String>>((int) 'a');
        hrqueue_comparable_str1.clear();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.clear();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.clear();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        boolean b11 = hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }
}

