// ���K���8-1
public class Cleric {
  // ���K���8-2
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  // ���K���8-3
  public void selfAid() {
    System.out.println(this.name + "�̓Z���t�G�C�h���������I");
    this.hp = this.MAX_HP;
    this.mp -= 5;
    System.out.println("HP���ő�܂ŉ񕜂���");
  }

  // ���K���8-4
  public int pray(int sec) {
    System.out.println(this.name + "��" + sec + "�b�ԓV�ɋF�����I");

    // �_����̉񕜗ʂ𗐐���p���Č��肷��
    int recover = new Random().nextInt(3) + sec;

    // ���ۂ̉񕜗ʂ��v�Z����
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MP��" + recoverActual + "�񕜂���");
    return recoverActual;
  }
}