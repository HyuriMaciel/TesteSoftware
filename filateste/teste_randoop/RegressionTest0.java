import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        try {
            br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) (byte) 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>(0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) (short) 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        try {
            br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>((int) '#');
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        try {
            br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) (byte) 10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        try {
            br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) (short) 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>(10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>((int) (short) 10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) ' ');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) (byte) 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>(100);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        try {
            br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>((int) (short) 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) (short) 100);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) '#');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        boolean b5 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>(1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(0);
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) (short) 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>(0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) (short) 1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        try {
            java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>(100);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        boolean b5 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        try {
            java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) (byte) 100);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        boolean b4 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) (byte) 100);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        boolean b4 = hrqueue_comparable_str1.empty();
        int i5 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) (short) 100);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) (byte) 10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) (byte) 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) (byte) 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>(3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>(100);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>(10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>(10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        try {
            br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b8 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>((int) 'a');
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) ' ');
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "hi!" + "'", comparable_str4.equals("hi!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) (byte) 10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        int i11 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>(2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) (short) 1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertNull(comparable_str14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        int i3 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == (-1));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        try {
            br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        try {
            br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        int i11 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) (short) 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>(10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        int i5 = hrqueue_comparable_str1.size();
        try {
            java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        try {
            java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
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
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) (short) 10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        int i5 = hrqueue_comparable_str1.size();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        try {
            java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        try {
            java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(0);
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        int i4 = hrqueue_comparable_str1.size();
        boolean b5 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        int i12 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>(0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>(3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        try {
            java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>(2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        try {
            java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        try {
            java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>(100);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>((int) (byte) 10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        boolean b3 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i7 == 2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        boolean b10 = hrqueue_comparable_str1.empty();
        boolean b11 = hrqueue_comparable_str1.empty();
        int i12 = hrqueue_comparable_str1.size();
        int i13 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>(1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) 'a');
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        boolean b10 = hrqueue_comparable_str1.empty();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        try {
            java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) 'a');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b8 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = null;
        hrqueue_comparable_str1.push(comparable_str9);
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == (-1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        boolean b7 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        boolean b8 = hrqueue_comparable_str1.empty();
        boolean b9 = hrqueue_comparable_str1.empty();
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "" + "'", comparable_str4.equals(""));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) 'a');
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) 'a');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        try {
            br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        try {
            java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>(3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        int i5 = hrqueue_comparable_str1.size();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        try {
            java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
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
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b5 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        boolean b3 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        boolean b6 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        boolean b4 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>(100);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>(3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>(2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>((int) (byte) 100);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) 'a');
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        boolean b6 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        try {
            java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str17 + "' != '" + "hi!" + "'", comparable_str17.equals("hi!"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        int i10 = hrqueue_comparable_str1.size();
        int i11 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        try {
            java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        boolean b7 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>(0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        int i14 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "hi!" + "'", comparable_str4.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b11 = hrqueue_comparable_str1.empty();
        boolean b12 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b14 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b8 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) ' ');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        int i3 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) (byte) 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i9 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(i9 == 3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        boolean b4 = hrqueue_comparable_str1.empty();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        boolean b7 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        boolean b3 = hrqueue_comparable_str1.empty();
        int i4 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        boolean b8 = hrqueue_comparable_str1.empty();
        int i9 = hrqueue_comparable_str1.size();
        boolean b10 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "hi!" + "'", comparable_str11.equals("hi!"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i9 == 2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((int) '4');
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b9 = hrqueue_comparable_str1.empty();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        boolean b4 = hrqueue_comparable_str1.empty();
        int i5 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "" + "'", comparable_str16.equals(""));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        try {
            java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        int i13 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i13 == 2);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        try {
            java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.front();
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
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        int i3 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>((int) (short) 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        boolean b10 = hrqueue_comparable_str1.empty();
        boolean b11 = hrqueue_comparable_str1.empty();
        int i12 = hrqueue_comparable_str1.size();
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == (-2));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.back();
        int i15 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.back();
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
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(comparable_str16);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        int i2 = hrqueue_comparable_str1.size();
        boolean b3 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i18 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i18 == 7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        boolean b15 = hrqueue_comparable_str1.empty();
        boolean b16 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b11 = hrqueue_comparable_str1.empty();
        boolean b12 = hrqueue_comparable_str1.empty();
        int i13 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        boolean b5 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        boolean b7 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == (-1));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        boolean b8 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i11 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i12 = hrqueue_comparable_str1.size();
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        int i14 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(3);
        int i2 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        try {
            br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        int i18 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str19 = hrqueue_comparable_str1.back();
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
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNull(comparable_str19);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>(7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        hrqueue_comparable_str1.push(comparable_str8);
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        int i11 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(i11 == 2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == (-2));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        boolean b9 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(3);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>(0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == (-1));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        boolean b9 = hrqueue_comparable_str1.empty();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        boolean b4 = hrqueue_comparable_str1.empty();
        int i5 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(0);
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        try {
            java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        boolean b10 = hrqueue_comparable_str1.empty();
        int i11 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) (byte) 1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(3);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
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
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.pop();
        boolean b17 = hrqueue_comparable_str1.empty();
        boolean b18 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str15 + "' != '" + "hi!" + "'", comparable_str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        try {
            java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(10);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        try {
            br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        try {
            br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
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
        java.lang.Comparable<java.lang.String> comparable_str17 = hrqueue_comparable_str1.back();
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
        org.junit.Assert.assertNull(comparable_str17);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
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
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.front();
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
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
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
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        boolean b4 = hrqueue_comparable_str1.empty();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        boolean b9 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        int i3 = hrqueue_comparable_str1.size();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b10 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) '#');
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
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
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
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
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 100);
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "hi!" + "'", comparable_str13.equals("hi!"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        int i9 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b11 = hrqueue_comparable_str1.empty();
        boolean b12 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == (-2));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        boolean b8 = hrqueue_comparable_str1.empty();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertNull(comparable_str16);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(4);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b14 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        int i11 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 2);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) (byte) 10);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '#');
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == (-1));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        try {
            java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) '#');
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        boolean b6 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue(i12 == 3);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        try {
            java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = null;
        hrqueue_comparable_str1.push(comparable_str7);
        int i9 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>(1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        boolean b14 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        try {
            br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>> hrqueue_hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>>((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        boolean b4 = hrqueue_comparable_str1.empty();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        int i11 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>(1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str15 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.front();
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
        org.junit.Assert.assertNull(comparable_str16);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = null;
        hrqueue_comparable_str1.push(comparable_str9);
        boolean b11 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "" + "'", comparable_str8.equals(""));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 2);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "" + "'", comparable_str5.equals(""));
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        try {
            java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str18 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str18 + "' != '" + "" + "'", comparable_str18.equals(""));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "hi!" + "'", comparable_str4.equals("hi!"));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        boolean b3 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        int i3 = hrqueue_comparable_str1.size();
        int i4 = hrqueue_comparable_str1.size();
        try {
            java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        boolean b9 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
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
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        boolean b5 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
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
        int i16 = hrqueue_comparable_str1.size();
        int i17 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertTrue(i15 == 2);
        org.junit.Assert.assertTrue(i16 == 2);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.front();
        boolean b15 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertNull(comparable_str13);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        br.ufal.filateste.HRQueue<java.io.Serializable> hrqueue_serializable1 = new br.ufal.filateste.HRQueue<java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
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
        int i13 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(comparable_str14);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        boolean b10 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        try {
            br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
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
        boolean b17 = hrqueue_comparable_str1.empty();
        boolean b18 = hrqueue_comparable_str1.empty();
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
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        int i11 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        boolean b15 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str16 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str17 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue("'" + comparable_str13 + "' != '" + "" + "'", comparable_str13.equals(""));
        org.junit.Assert.assertNull(comparable_str14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + comparable_str16 + "' != '" + "hi!" + "'", comparable_str16.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str17);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        boolean b5 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        br.ufal.filateste.HRQueue<java.lang.Object> hrqueue_obj1 = new br.ufal.filateste.HRQueue<java.lang.Object>((int) (byte) 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        boolean b3 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        boolean b7 = hrqueue_comparable_str1.empty();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
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
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>(4);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        int i7 = hrqueue_comparable_str1.size();
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 0);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = null;
        hrqueue_comparable_str1.push(comparable_str12);
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
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
        int i18 = hrqueue_comparable_str1.size();
        boolean b19 = hrqueue_comparable_str1.empty();
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
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        int i10 = hrqueue_comparable_str1.size();
        boolean b11 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(i10 == 2);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "" + "'", comparable_str12.equals(""));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i10 == 3);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b9 = hrqueue_comparable_str1.empty();
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str17 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str17);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        int i2 = hrqueue_comparable_str1.size();
        boolean b3 = hrqueue_comparable_str1.empty();
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(comparable_str5);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(7);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        boolean b7 = hrqueue_comparable_str1.empty();
        try {
            hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        int i6 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == (-2));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        int i2 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        boolean b8 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        boolean b10 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str11 = null;
        try {
            hrqueue_comparable_str1.push(comparable_str11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str12 + "' != '" + "hi!" + "'", comparable_str12.equals("hi!"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        int i2 = hrqueue_comparable_str1.size();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 2);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
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
        boolean b15 = hrqueue_comparable_str1.empty();
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
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b6 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        boolean b3 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        int i7 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        boolean b10 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "" + "'", comparable_str9.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        int i4 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.pop();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi!" + "'", comparable_str8.equals("hi!"));
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b13 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
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
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue("'" + comparable_str11 + "' != '" + "" + "'", comparable_str11.equals(""));
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.pop();
        int i4 = hrqueue_comparable_str1.size();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == (-1));
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        boolean b5 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i13 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.pop();
        boolean b15 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "" + "'", comparable_str10.equals(""));
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        int i7 = hrqueue_comparable_str1.size();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        int i8 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(100);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.pop();
        boolean b3 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        int i7 = hrqueue_comparable_str1.size();
        boolean b8 = hrqueue_comparable_str1.empty();
        int i9 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        int i9 = hrqueue_comparable_str1.size();
        int i10 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str12 = hrqueue_comparable_str1.back();
        boolean b13 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str14 = hrqueue_comparable_str1.front();
        boolean b15 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(comparable_str11);
        org.junit.Assert.assertNull(comparable_str12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + comparable_str14 + "' != '" + "" + "'", comparable_str14.equals(""));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        int i8 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (byte) 100);
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b9 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        boolean b11 = hrqueue_comparable_str1.empty();
        int i12 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.front();
        boolean b10 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(comparable_str11);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        try {
            br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>((int) '4');
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        br.ufal.filateste.HRQueue<java.lang.String> hrqueue_str1 = new br.ufal.filateste.HRQueue<java.lang.String>(3);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "" + "'", comparable_str7.equals(""));
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
        try {
            java.lang.Comparable<java.lang.String> comparable_str11 = hrqueue_comparable_str1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        int i7 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.back();
        int i5 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertNull(comparable_str8);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        java.lang.Comparable<java.lang.String> comparable_str2 = null;
        hrqueue_comparable_str1.push(comparable_str2);
        boolean b4 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.front();
        int i6 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str8 = null;
        hrqueue_comparable_str1.push(comparable_str8);
        boolean b10 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        try {
            br.ufal.filateste.HRQueue<java.lang.CharSequence> hrqueue_charSequence1 = new br.ufal.filateste.HRQueue<java.lang.CharSequence>((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
        } catch (java.lang.NegativeArraySizeException e) {
        }
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str5 = null;
        hrqueue_comparable_str1.push(comparable_str5);
        boolean b7 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str8 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(comparable_str8);
        org.junit.Assert.assertNull(comparable_str9);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        boolean b2 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str3 = hrqueue_comparable_str1.back();
        int i4 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertNull(comparable_str6);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>(1);
        java.lang.Comparable<java.lang.String> comparable_str2 = hrqueue_comparable_str1.front();
        int i3 = hrqueue_comparable_str1.size();
        java.lang.Comparable<java.lang.String> comparable_str4 = hrqueue_comparable_str1.pop();
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        boolean b6 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b9 = hrqueue_comparable_str1.empty();
        org.junit.Assert.assertNull(comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(comparable_str4);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.front();
        java.lang.Comparable<java.lang.String> comparable_str7 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        int i10 = hrqueue_comparable_str1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "" + "'", comparable_str6.equals(""));
        org.junit.Assert.assertNull(comparable_str7);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) '4');
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        boolean b4 = hrqueue_comparable_str1.empty();
        boolean b5 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str6 = hrqueue_comparable_str1.back();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.pop();
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(comparable_str6);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>> hrqueue_comparable_str1 = new br.ufal.filateste.HRQueue<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean b2 = hrqueue_comparable_str1.empty();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> comparable_str5 = hrqueue_comparable_str1.back();
        int i6 = hrqueue_comparable_str1.size();
        hrqueue_comparable_str1.push((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str9 = hrqueue_comparable_str1.back();
        java.lang.Comparable<java.lang.String> comparable_str10 = hrqueue_comparable_str1.back();
        boolean b11 = hrqueue_comparable_str1.empty();
        boolean b12 = hrqueue_comparable_str1.empty();
        java.lang.Comparable<java.lang.String> comparable_str13 = hrqueue_comparable_str1.back();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNull(comparable_str9);
        org.junit.Assert.assertNull(comparable_str10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(comparable_str13);
    }
}

