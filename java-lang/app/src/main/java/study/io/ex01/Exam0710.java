// 활용 - 지정한 폴더 및 그 하위 폴더까지 모두 검색하여 파일 및 디렉토리 이름을 출력하라.
package study.io.ex01;

import java.io.File;

public class Exam0710 {

  public static void main(String[] args) throws Exception {

    // 결과 예)
    // /Users/bitcamp/git/test
    // src/
    //   main/
    //     java/
    //       com/
    //         Hello.java
    //         Hello2.java
    // build.gradle
    // settings.gradle
    // Hello.java
    // ...

    File dir = new File(".");
    System.out.println(dir.getCanonicalPath());

    printList(dir, 1);
  }

  static void printList(File dir, int level) {

    // 현재 디렉토리의 하위 파일 및 디렉토리 목록을 알아낸다.
    File[] files = dir.listFiles();

    // 리턴 받은 파일 배열에서 이름을 꺼내 출력한다.
    String indent = getIndent(level);

    for (File file : files) {

      System.out.print(indent);

      if (file.isDirectory() && !file.isHidden()) {
        System.out.printf("%s/\n", file.getName());
        printList(file, level + 1);
      } else if (file.isFile()) {
        System.out.print("\\-- ");
        System.out.printf("%s\n", file.getName());
      }
    }
  }

  static String getIndent(int level) {
    StringBuilder strBuilder = new StringBuilder();
    for (int i = 0; i < level; i++) {
      strBuilder.append("  ");
    }
    return strBuilder.toString();
  }

}


