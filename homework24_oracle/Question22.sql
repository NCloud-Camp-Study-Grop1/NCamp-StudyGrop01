--뷰 이름은 자유
--1) 학생의 평점 4.5 만점으로 환산된 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_STUDENT_AVR(
	STUDENT_NUM,
	STUDENT_NAME,
	STUDENT_AVR
) AS (
	SELECT SNO
		, SNAME
		, (AVR / 4.0) * 4.5
		FROM STUDENT
);

SELECT *
	FROM V_STUDENT_AVR;


--2) 각 과목별 기말고사 평균 점수를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_COURSE_SCORE_AVG(
	COURSE_NUM,
	COURSE_NAME,
	SCORE_AVG
) AS (
	SELECT C.CNO 
		, C.CNAME 
		, AVG(SC.RESULT) 
		FROM COURSE C
		JOIN SCORE SC
		  ON C.CNO = SC.CNO
		GROUP BY C.CNO, C.CNAME 
);

SELECT *
	FROM V_COURSE_SCORE_AVG;

--3) 각 사원과 관리자(MGR)의 이름을 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_EMP_MGR (
	EMP_NUM,
	EMP_NAME,
	EMP_MGR,
	EMP_MGR_NAME
) AS (
	SELECT E.ENO
		, E.ENAME 
		, EM.MGR
		, EM.ENAME
		FROM EMP E
		JOIN EMP EM
		  ON EM.MGR = E.ENO
);

SELECT *
	FROM V_EMP_MGR;

--4) 각 과목별 기말고사 평가 등급(A~F)까지와 해당 학생 정보를 검색할 수 있는 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_STUDENT_COURSE_GRADE (
	STUDENT_NUM,
	STUDENT_NAME,
	COURSE_NAME,
	SCGRADE_GRADE
) AS (
	SELECT ST.SNO 
		, ST.SNAME 
		, C.CNAME 
		, SG.GRADE 
		FROM COURSE C
		JOIN SCORE SC
		  ON SC.CNO = C.CNO 
		JOIN STUDENT ST
		  ON SC.SNO = ST.SNO 
		JOIN SCGRADE SG
		  ON SC.RESULT BETWEEN SG.LOSCORE AND SG.HISCORE 
);

SELECT *
	FROM V_STUDENT_COURSE_GRADE;

--5) 물리학과 교수의 과목을 수강하는 학생의 명단을 검색할 뷰를 생성하세요.
CREATE OR REPLACE VIEW V_PROFESSOR_STUDENT(
	PROFESSOR_NAME,
	PROFESSOR_SECTION,
	STUDENT_NUM,
	STUDENT_NAME,
	STUDENT_MAJOR
) AS (
	SELECT P.PNAME 
		, P.SECTION
		, ST.SNO 
		, ST.SNAME 
		, ST.MAJOR 
		FROM PROFESSOR P
		JOIN COURSE C
		  ON C.PNO = P.PNO 
		JOIN SCORE SC
		  ON SC.CNO = C.CNO 
		JOIN STUDENT ST
		  ON ST.SNO = SC.SNO 
		WHERE P.SECTION = '물리'
);

SELECT *
	FROM V_PROFESSOR_STUDENT;
