public class Main {
  // 8-1 main���\�b�h�����
  public static void main(String[] args) {
    // 8-9.10.11�@�E�҂��쐬
    Hero h = new Hero();
    // 8-12 �E�҃C���X�^���X�𐶐����ď����l����
    h.name = "�~�i�g";
    h.hp = 100;
    System.out.println("�E��" + h.name + "�𐶂ݏo���܂����I");
    // 8-12 ���z���E�ɗE�҂𐶂ݏo���v���O����
    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();
  }
}
