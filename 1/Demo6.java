// JDK = �~UTF-8(��������) �ZShift JIS
// JDK��Java�̎��s���s���ꍇ��VScode�̕����R�[�h��Japanese(Shift JIS)�ɕϊ�����K�v������B

// Eclipse = �~Shift JIS(��������) �ZUTF-8

// --�����R�[�h���m�F����(java�R�[�h���ɋL��)--
// System.out.println(System.getProperty("file.encoding"));



// 6-5 �p�b�P�[�W
package calcapp.main;

// 6-8 �C���|�[�g
// import calcapp.logics.Demo6CalcLogic;

// 6-9 �S�N���X�̃C���|�[�g
// import calcapp.logics.Demo6CalcLogic.*;

public class Demo6 {

  // 6-1 �v�Z�@�v���O����
  // public static void Main(String[] args){
  //   int a = 10; int b = 2;
  //   int total = tasu(a,b);
  //   int delta = hiku(a,b);
  //   System.out.println("������" + total + "�A������" + delta);
  // }
  // public static int tasu(int a, int b){
  //   return (a + b);
  // }
  // public static int hiku(int a, int b){
  //   return (a - b);
  // }

  // 6-3 main���\�b�h�����c���ꂽ�@Demo6.java
  // 6-4 �C����@Demo6.java
  // 6-7 �C����@Demo6.java
  public static void main(String[] args){
    int a = 10; int b = 2;
    int total = calcapp.logics.Demo6CalcLogic.tasu(a,b); //�C��
    int delta = calcapp.logics.Demo6CalcLogic.hiku(a,b); //�C��
    System.out.println("������" + total + "�A������" + delta);

  }
}