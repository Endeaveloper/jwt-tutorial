package linux;

public class Command {

/*
    # 찾기 관련
    사용법
    find [찾을위치] -name [파일명]
    => 최상위 폴더부터 하위로 'HAHAHA' 로 시작하는 파일 찾기.
    find / -name 'HAHAHA*'

    파일 내부 문자열 검색
    - 현재위치부터 하위폴더의 모든 파일 중에서 'HAHAHA' 이라는 문자열을 검색한다.
    find . -type f -print | xargs grep -i "HAHAHA" /dev/null
*/






}
