--1) 학생중에 동명이인을 검색한다
SELECT S1.SNO 
	, S1.SNAME 
	, S2.SNO
	, S2.SNAME 
	FROM STUDENT S1
	JOIN STUDENT S2
	  ON S1.SNAME = S2.SNAME 
	 AND S1.SNO != S2.SNO
	ORDER BY S1.SNAME;

--2) 전체 교수 명단과 교수가 담당하는 과목의 이름을 학과 순으로 검색한다
SELECT P.PNO 
	, P.PNAME 
	, P.SECTION
	, P.ORDERS 
	, P.HIREDATE 
	, C.CNO 
	, C.CNAME 
	FROM PROFESSOR P 
	JOIN COURSE C
	  ON C.PNO = P.PNO ;
	

--3) 이번 학기 등록된 모든 과목과 담당 교수의 학점 순으로 검색한다
SELECT C.CNO 
	, C.CNAME 
	, C.ST_NUM 
	, P.PNO 
	, P.PNAME 
	FROM COURSE C
	LEFT JOIN PROFESSOR P
	  ON C.PNO = P.PNO 
	ORDER BY C.ST_NUM ;
