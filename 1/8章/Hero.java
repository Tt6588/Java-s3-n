// 8-2 hero�N���X��java�̃R�[�h�ŕ\��������
// 8-3 ���hero�N���X

public class Hero {
  // 8-4 hero�N���X�ɖ��O��HP��ϐ��Ƃ��Đ錾
  String name;
  int hp;

  // 8-7 ���鑀��Ɋ܂܂��v�f���L�q
  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "�́A�����ĉ񕜂����I");
  }

  // 8-8 ���\�b�h�u����v�u�]�ԁv�u������v��ǉ�
  public void sit(int sec) {
    this.hp += sec;
    System.out.println(this.name + "�́A" + sec + "�b�������I");
    System.out.println("HP��" + sec + "�|�C���g�񕜂���");
  }

  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "�́A�]�񂾁I");
    System.out.println("5�̃_���[�W�I");
  }

  public void run() {
    System.out.println(this.name + "�́A�����o�����I");
    System.out.println("GAMEOVER");
    System.out.println("�ŏIHP��" + this.hp + "�ł���");
  }
}