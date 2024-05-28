--1) WITH 절을 이용하여 정교수만 모여있는 가상테이블 하나와 일반과목(과목명에 일반이 포함되는)들이 모여있는 가상테이블 하나를 생성하여 
--   일반과목들을 강의하는 교수의 정보 조회하세요.(과목번호, 과목명, 교수번호, 교수이름)
WITH
	ORDES_P AS(
		SELECT PNO
			, PNAME
			FROM PROFESSOR
			WHERE ORDERS = '정교수'
	),
	COURSE_C AS (
		SELECT CNO 
			, CNAME
			, PNO
			FROM COURSE
			WHERE CNAME LIKE '%일반%'
	)
SELECT COURSE_C.CNO
	, COURSE_C.CNAME
	, ORDES_P.PNO
	, ORDES_P.PNAME
	FROM COURSE_C
	JOIN ORDES_P
	  ON ORDES_P.PNO = COURSE_C.PNO;

--2) WITH 절을 이용하여 급여가 3000이상인 사원정보를 갖는 가상테이블 하나와 보너스가 500이상인 사원정보를 갖는 가상테이블 하나를 생성하여
--   두 테이블에 모두 속해있는 사원의 정보를 모두 조회하세요.
WITH
	SAL3000 AS (
		SELECT ENO
			, ENAME
			, SAL
			, JOB
			, COMM
			FROM EMP 
			WHERE SAL >= 3000
	),
	COMM500 AS(
		SELECT ENO
			, ENAME
			, SAL
			, JOB
			, COMM
			FROM EMP
			WHERE COMM >= 500
	)
SELECT SAL3000.ENO
	, SAL3000.ENAME
	, COMM500.SAL
	, COMM500.JOB
	, COMM500.COMM
	FROM SAL3000
	JOIN COMM500
	  ON SAL3000.ENO = COMM500.ENO
	  
--3) WITH 절을 이용하여 평점이 3.3이상인 학생의 목록을 갖는 가상테이블 하나와 학생별 기말고사 평균점수를 갖는 가상테이블 하나를 생성하여
--   평점이 3.3이상인 학생의 기말고사 평균 점수를 조회하세요.
WITH
	AVR33 AS (
		SELECT SNO
			, SNAME
			, AVG(AVR) 
			FROM STUDENT
			GROUP BY SNO, SNAME
			HAVING AVG(AVR) >= 3.3 
	),
	SCORE_S AS (
		SELECT SNO
			, AVG(RESULT) AS AVGSCORE
			FROM SCORE 
			GROUP BY SNO
	)
SELECT AVR33.SNO
	, AVR33.SNAME
	, AVG(SCORE_S.AVGSCORE) AS AVG
	FROM AVR33
	JOIN SCORE_S
	  ON AVR33.SNO = SCORE_S.SNO
	GROUP BY AVR33.SNO, AVR33.SNAME;

--4) WITH 절을 이용하여 부임일자가 25년이상된 교수정보를 갖는 가상테이블 하나와 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 기말고사성적을
--   갖는 가상테이블 하나를 생성하여 기말고사 성적이 90이상인 과목번호, 과목명, 학생번호, 학생이름, 교수번호, 교수이름, 기말고사성적을 조회하세요.