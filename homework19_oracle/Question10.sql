--1) 각 과목의 과목명과 담당 교수의 교수명을 검색하라
SELECT C.CNO 
	, C.CNAME 
	, C.ST_NUM 
	, P.PNO 
	, P.PNAME 
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO;

--2) 화학과 학생의 기말고사 성적을 모두 검색하라
SELECT ST.SNO 
	, ST.SNAME 
	, ST.SYEAR 
	, ST.MAJOR 
	, SC.RESULT
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO
	 WHERE ST.MAJOR = '화학'
	 ORDER BY SC.RESULT;
	
--3) 유기화학과목 수강생의 기말고사 시험점수를 검색하라
SELECT 
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO
	JOIN COURSE C
	  ON C.CNO = SC.CNO 
	WHERE C.CNAME = '유기화학'
	ORDER BY SC.RESULT;

--4) 화학과 학생이 수강하는 과목을 담당하는 교수의 명단을 검색하라
SELECT ST.SNO 
	, ST.SNAME 
	, ST.SYEAR 
	, ST.MAJOR 
	, C.CNO 
	, C.CNAME 
	, P.PNO 
	, P.PNAME 
	FROM STUDENT ST
	JOIN SCORE S
	  ON S.SNO  = ST.SNO 
	JOIN COURSE C
	  ON C.CNO = S.CNO 
	JOIN PROFESSOR P
	  ON P.PNO = C.PNO
	WHERE ST.MAJOR = '화학'
	  AND ST.SYEAR = '1';

--5) 모든 교수의 명단과 담당 과목을 검색한다
SELECT C.CNAME 
	, P.PNO 
	, P.PNAME 
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO;

--6) 모든 교수의 명단과 담당 과목을 검색한다(단 모든 과목도 같이 검색한다)
SELECT P.PNO 
	, P.PNAME 
	, P.ORDERS 
	, P.SECTION 
	, C.CNAME 
	FROM PROFESSOR P
	LEFT JOIN COURSE C
	  ON C.PNO = P.PNO ;
