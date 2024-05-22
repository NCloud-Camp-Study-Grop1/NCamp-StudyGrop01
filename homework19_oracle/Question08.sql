--1) 송강 교수가 강의하는 과목을 검색한다
SELECT SECTION
	FROM PROFESSOR
	WHERE PNAME = '송강';

--2) 화학 관련 과목을 강의하는 교수의 명단을 검색한다
SELECT *
	FROM PROFESSOR
	WHERE SECTION = '화학';

--3) 학점이 2학점인 과목과 이를 강의하는 교수를 검색한다
SELECT C.CNO 
	, C.CNAME 
	, C.ST_NUM 
	, P.PNO 
	, P.PNAME 
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO 
	WHERE C.ST_NUM = '2';

--4) 화학과 교수가 강의하는 과목을 검색한다
SELECT P.PNO 
	, P.PNAME 
	, C.CNO 
	, C.CNAME 
	, C.ST_NUM 
	FROM PROFESSOR P
	JOIN COURSE C
	  ON P.PNO = C.PNO 
	WHERE P.SECTION = '화학';

--5) 화학과 1학년 학생의 기말고사 성적을 검색한다
SELECT ST.SNO 
	, ST.SNAME 
	, SC.RESULT
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO 
	WHERE ST.MAJOR = '화학'
	ORDER BY SC.RESULT;

--6) 일반화학 과목의 기말고사 점수를 검색한다
SELECT C.CNAME  
	, S.RESULT
	FROM COURSE C
	JOIN SCORE S
	  ON C.CNO = S.CNO
	WHERE C.CNAME = '일반화학'
	ORDER BY S.RESULT;

--7) 화학과 1학년 학생의 일반화학 기말고사 점수를 검색한다
SELECT ST.SNO 
	, ST.SNAME 
	, ST.SYEAR 
	, ST.MAJOR 
	, C.CNAME 
	, SC.RESULT
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO
	JOIN COURSE C
	  ON C.CNO = SC.CNO 
	WHERE ST.MAJOR = '화학'
	  AND C.CNAME  = '일반화학'
	ORDER BY SC.RESULT;

--8) 화학과 1학년 학생이 수강하는 과목을 검색한다
SELECT ST.SNO 
	, ST.SNAME 
	, ST.SYEAR 
	, ST.MAJOR 
	, C.CNO 
	, C.CNAME 
	FROM STUDENT ST
	JOIN SCORE S
	  ON S.SNO  = ST.SNO 
	JOIN COURSE C
	  ON C.CNO = S.CNO 
	WHERE ST.MAJOR = '화학'
	  AND ST.SYEAR = '1';

--9) 유기화학 과목의 평가점수가 F인 학생의 명단을 검색한다
SELECT ST.SNO 
	, ST.SNAME 
	, ST.SYEAR 
	, ST.MAJOR 
	, C.CNAME 
	, SG.GRADE 
	FROM STUDENT ST
	JOIN SCORE SC
	  ON SC.SNO = ST.SNO 
	JOIN COURSE C
	  ON SC.CNO = C.CNO 
	JOIN SCGRADE SG
	  ON SC.RESULT BETWEEN SG.LOSCORE AND SG.HISCORE 
	WHERE C.CNAME = '유기화학'
	  AND SG.GRADE = 'F';

