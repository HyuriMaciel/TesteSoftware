import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test001");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        boolean b12 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b8 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.front();
        boolean b15 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "hi!" + "'", comparable_str14.equals("hi!"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        boolean b2 = hrqueue_comparable_str1.empty();
        boolean b3 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        boolean b8 = hrqueue_comparable_str1.empty();
        boolean b9 = hrqueue_comparable_str1.empty();
        boolean b10 = hrqueue_comparable_str1.empty();
        try {
            java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "hi!" + "'", comparable_str4.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        hrqueue_comparable_str1.push(comparable_str8);
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        boolean b2 = hrqueue_comparable_str1.empty();
        boolean b3 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b9 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = hrqueue_comparable_str1.size();
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i11 == 3);
        org.junit.Assert.assertTrue(i12 == 3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str15 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "" + "'", comparable_str15.equals(""));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        int i13 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i9 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertNull(comparable_str13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == (-1));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str15 = hrqueue_comparable_str1.front();
        boolean b16 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str19 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(comparable_str19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        int i6 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) '4');
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        boolean b12 = hrqueue_comparable_str1.empty();
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str15 = hrqueue_comparable_str1.back();
        int i16 = hrqueue_comparable_str1.size();
        boolean b17 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str18 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str19 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str20 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str21 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str15);
        org.junit.Assert.assertTrue(i16 == 4);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(comparable_str18);
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str20);
        org.junit.Assert.assertTrue("'" + comparable_str21 + "' != '" + "hi!" + "'", comparable_str21.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        int i6 = hrqueue_comparable_str1.size();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        hrqueue_comparable_str1.push(comparable_str8);
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertNull(comparable_str13);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        boolean b12 = hrqueue_comparable_str1.empty();
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        boolean b9 = hrqueue_comparable_str1.empty();
        int i10 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        int i8 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.front();
        int i15 = hrqueue_comparable_str1.size();
        int i16 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue(i16 == (-1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        int i12 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        boolean b11 = hrqueue_comparable_str1.empty();
        boolean b12 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        int i14 = hrqueue_comparable_str1.size();
        int i15 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i13 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str17 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i13 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "" + "'", comparable_str17.equals(""));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "hi!" + "'", comparable_str4.equals("hi!"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b9 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b11 = hrqueue_comparable_str1.empty();
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        int i11 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        boolean b7 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "hi!" + "'", comparable_str4.equals("hi!"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        int i10 = hrqueue_comparable_str1.size();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == (-3));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        boolean b14 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str15 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(comparable_str15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str15 = hrqueue_comparable_str1.back();
        int i16 = hrqueue_comparable_str1.size();
        boolean b17 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str18 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str15);
        org.junit.Assert.assertTrue(i16 == 4);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(comparable_str18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) 'a');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        boolean b2 = hrqueue_comparable_str1.empty();
        boolean b3 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        int i14 = hrqueue_comparable_str1.size();
        boolean b15 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.pop();
        int i17 = hrqueue_comparable_str1.size();
        boolean b18 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str19 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str20 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str21 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(comparable_str16);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(comparable_str19);
        org.junit.Assert.assertNull(comparable_str20);
        org.junit.Assert.assertNull(comparable_str21);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        try {
            java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        boolean b4 = hrqueue_comparable_str1.empty();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        boolean b9 = hrqueue_comparable_str1.empty();
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        boolean b13 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str15 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertNull(comparable_str15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>(6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        boolean b8 = hrqueue_comparable_str1.empty();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = hrqueue_comparable_str1.size();
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b9 = hrqueue_comparable_str1.empty();
        int i10 = hrqueue_comparable_str1.size();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(2);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) ' ');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        boolean b3 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == (-2));
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(3);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        boolean b13 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.back();
        int i15 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str19 = hrqueue_comparable_str1.front();
        int i20 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str19 + "' != '" + "hi!" + "'", comparable_str19.equals("hi!"));
        org.junit.Assert.assertTrue(i20 == 3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>(6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b12 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        boolean b9 = hrqueue_comparable_str1.empty();
        boolean b10 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertNull(comparable_str16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        try {
            java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        boolean b9 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.front();
        boolean b14 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        int i3 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        boolean b9 = hrqueue_comparable_str1.empty();
        boolean b10 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertNull(comparable_str13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        int i12 = hrqueue_comparable_str1.size();
        int i13 = hrqueue_comparable_str1.size();
        boolean b14 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        boolean b7 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str17 = hrqueue_comparable_str1.back();
        boolean b18 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str19 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertNull(comparable_str16);
        org.junit.Assert.assertNull(comparable_str17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(comparable_str19);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        boolean b7 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) ' ');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        boolean b7 = hrqueue_comparable_str1.empty();
        boolean b8 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        int i2 = hrqueue_comparable_str1.size();
        boolean b3 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        boolean b9 = hrqueue_comparable_str1.empty();
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        boolean b12 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        boolean b7 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        boolean b11 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b12 = hrqueue_comparable_str1.empty();
        int i13 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b11 = hrqueue_comparable_str1.empty();
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 2);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        boolean b10 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        boolean b14 = hrqueue_comparable_str1.empty();
        boolean b15 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "hi!" + "'", comparable_str4.equals("hi!"));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        int i12 = hrqueue_comparable_str1.size();
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) (short) 100);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        int i3 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        boolean b8 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        boolean b12 = hrqueue_comparable_str1.empty();
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str15 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.pop();
        boolean b17 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertNull(comparable_str15);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        int i11 = hrqueue_comparable_str1.size();
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
    }
}

