public class Main {
  // 8-1 main���\�b�h�����
  public static void main(String[] args) {
    // // 8-9.10.11�@�E�҂��쐬
    // Hero h = new Hero();
    // // 8-12 �E�҃C���X�^���X�𐶐����ď����l����
    // h.name = "�~�i�g";
    // h.hp = 100;
    // System.out.println("�E��" + h.name + "�𐶂ݏo���܂����I");
    // // 8-13 ���z���E�ɗE�҂𐶂ݏo���v���O����
    // h.sit(5);
    // h.slip();
    // h.sit(25);
    // h.run();

    // 8-14 �I�u�W�F�N�g�w���ł͂Ȃ����@�ō쐬�����v���O����
    // int yusha_hp = 100;
    // int matango1_hp = 50;
    // int matango2_hp = 48;
    // String yusha_name = "�~�i�g";
    // int matango1_level = 10;
    // int matango2_level = 10;
    // System.out.println(yusha_name + "��5�b�������I");
    // yusha_hp += 5;
    // System.out.println("HP��5�|�C���g�񕜂���");
    // /* �F */
    // /* �F */

    // 8-16 ���z���E�ɗE�҂Ƃ������L�m�R2�C�𐶐�����
    Hero h = new Hero();
    h.name = "�~�i�g";
    h.hp = 100;

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}
