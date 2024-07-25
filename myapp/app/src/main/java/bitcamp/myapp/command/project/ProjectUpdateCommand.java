package bitcamp.myapp.command.project;

import bitcamp.myapp.command.Command;
import bitcamp.myapp.vo.Project;
import bitcamp.util.Prompt;
import java.util.List;
import java.util.Map;

public class ProjectUpdateCommand implements Command {

  private Map<Integer, Project> projectMap;
  private ProjectMemberHandler memberHandler;

  public ProjectUpdateCommand(Map<Integer, Project> projectMap,ProjectMemberHandler memberHandler) {
    this.projectMap = projectMap;
    this.memberHandler = memberHandler;
  }

  @Override
  public void execute(String menuName) {
    System.out.printf("[%s]\n", menuName);
    int projectNo = Prompt.inputInt("프로젝트 번호?");

    Project project = projectMap.get(projectNo);
    if (project == null) {
      System.out.println("없는 프로젝트입니다.");
      return;
    }

    project.setTitle(Prompt.input("프로젝트명(%s)?", project.getTitle()));
    project.setDescription(Prompt.input("설명(%s)?", project.getDescription()));
    project.setStartDate(Prompt.input("시작일(%s)?", project.getStartDate()));
    project.setEndDate(Prompt.input("종료일(%s)?", project.getEndDate()));

    System.out.println("팀원:");
    memberHandler.deleteMembers(project);
    memberHandler.addMembers(project);

    System.out.println("변경 했습니다.");
  }


}
