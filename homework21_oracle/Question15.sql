--1) 화학과를 제외하고 학과별로 학생들의 평점 평균을 검색하세요
SELECT MAJOR 
	, AVG(AVR) 
	FROM STUDENT
	GROUP BY MAJOR 
	ORDER BY AVG(AVR) ;

--2) 화학과를 제외한 각 학과별 평균 평점 중에 평점이 2.0 이상인 정보를 검색하세요
SELECT SNO 
	, SNAME 
	, SYEAR 
	, MAJOR 
	FROM STUDENT
	WHERE AVR >= 2.0
	  AND MAJOR != '화학'
	ORDER BY MAJOR, SYEAR;

--3) 기말고사 평균이 60점 이상인 학생의 정보를 검색하세요
SELECT ST.SNO 
	, ST.SNAME 
	, ST.SYEAR 
	, ST.MAJOR 
	, AVG(SC.RESULT)
	FROM STUDENT ST
	JOIN SCORE SC
	  ON ST.SNO = SC.SNO
	GROUP BY ST.SNO, ST.SNAME, ST.SYEAR, ST.MAJOR 
	HAVING AVG(SC.RESULT) >= 60;

--4) 강의 학점이 3학점 이상인 교수의 정보를 검색하세요
SELECT C.CNO 
	, C.CNAME 
	, C.ST_NUM 
	, P.PNO 
	, P.PNAME 
	FROM COURSE C
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO 
	WHERE C.ST_NUM >= 3
	ORDER BY C.CNO;

--5) 기말고사 평균 성적이 핵 화학과목보다 우수한 과목의 과목명과 담당 교수명을 검색하세요
SELECT C.CNAME 
	, AVG(SC.RESULT) 
	, P.PNAME 
	FROM SCORE SC
	JOIN COURSE C
	  ON C.CNO = SC.CNO 
	JOIN PROFESSOR P
	  ON C.PNO = P.PNO 
	GROUP BY C.CNAME , P.PNAME 
	HAVING AVG(SC.RESULT)  > 50.49;

--6) 근무 중인 직원이 4명 이상인 부서를 검색하세요(부서번호, 부서명, 인원수)
SELECT E.DNO 
	, D.DNAME 
	, COUNT(*)
	FROM EMP E
	JOIN DEPT D
      ON E.DNO = D.DNO 
    GROUP BY E.DNO, D.DNAME ;
   
--7) 업무별 평균 연봉이 3000 이상인 업무를 검색하세요
SELECT JOB 
	, AVG(SAL) 
	FROM EMP
	GROUP BY JOB
	HAVING AVG(SAL) >= 3000; 

--8) 각 학과의 학년별 인원중 인원이 5명 이상인 학년을 검색하세요
SELECT MAJOR 
	, SYEAR 
	, COUNT(*) 
	FROM STUDENT
	GROUP BY MAJOR, SYEAR
	HAVING COUNT(*) >= 5
	ORDER BY MAJOR, SYEAR; 