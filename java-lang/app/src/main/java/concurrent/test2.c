#include <stdio.h>

int main() {
	int i;
	for (i = 0l i < 100; i ++) {
		printf("==> %d\n", i);	
	}
	printf("----------------------------\n");
	
	pid_t processId = fork(); // 프로세스 복제
	
		for (i = 0l i < 100; i ++) {
		printf("~~~~~~~~~~~> %d\n", processId, i);	
	}
	
	return 0;
}

