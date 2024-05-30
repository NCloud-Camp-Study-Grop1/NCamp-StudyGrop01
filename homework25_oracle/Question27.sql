--1) 과목번호, 과목이름, 교수번호, 교수이름을 담을 수 있는 변수들을 선언하고 
--   유기화학 과목의 과목번호, 과목이름, 교수번호, 교수이름을 출력하세요.
DECLARE
	COURSE_NO COURSE.CNO%TYPE;
	COURSE_NAME COURSE.CNAME%TYPE;
	PROFESSOR_NO PROFESSOR.PNO%TYPE;
	PROFESSOR_NAME PROFESSOR.PNAME%TYPE;
BEGIN
	SELECT C.CNO, C.CNAME, P.PNO, P.PNAME INTO COURSE_NO, COURSE_NAME, PROFESSOR_NO, PROFESSOR_NAME
		FROM COURSE C
		JOIN PROFESSOR P
		  ON C.PNO = P.PNO
		WHERE C.CNAME = '유기화학';
		
	DBMS_OUTPUT.PUT_LINE(COURSE_NO);
	DBMS_OUTPUT.PUT_LINE(COURSE_NAME);
	DBMS_OUTPUT.PUT_LINE(PROFESSOR_NO);
	DBMS_OUTPUT.PUT_LINE(PROFESSOR_NAME);
END;

--2) 위 데이터들을 레코드로 선언하고 출력하세요.
-- 레코드 선언
CREATE TABLE COURSE_PROFESSOR_RECORD
AS SELECT C.CNO, C.CNAME, P.PNO, P.PNAME
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO
	WHERE C.CNAME = '유기화학';

DECLARE
	TYPE COURSE_PROFESSOR_REC IS RECORD (
		COURSE_NO COURSE.CNO%TYPE,
		COURSE_NAME COURSE.CNAME%TYPE,
		PROFESSOR_NO PROFESSOR.PNO%TYPE,
		PROFESSOR_NAME PROFESSOR.PNAME%TYPE
	);
	COPRREC COURSE_PROFESSOR_REC;
	
BEGIN
	INSERT INTO COURSE_PROFESSOR_RECORD
	VALUES COPRREC;
END;

SELECT *
	FROM COURSE_PROFESSOR_RECORD;