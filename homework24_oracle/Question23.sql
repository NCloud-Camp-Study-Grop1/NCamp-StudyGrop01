--1) 4.5 환산 평점이 가장 높은 3인의 학생을 검색하세요.
SELECT ROWNUM
	, A.SNO
	, A.SNAME
	, A.AVR
	FROM (
		SELECT SNO
			, SNAME
			, (AVR / 4.0) * 4.5 AS AVR
			FROM STUDENT
			ORDER BY AVR DESC
	) A
	WHERE ROWNUM <= 3;

--2) 기말고사 과목별 평균이 높은 3과목을 검색하세요.
SELECT ROWNUM
	, A.CNO
	, A.CNAME
	, A.AVG_RESULT
	FROM (
		SELECT C.CNO
			, C.CNAME
			, AVG(SC.RESULT) AS AVG_RESULT
			FROM SCORE SC
			JOIN COURSE C
			  ON SC.CNO = C.CNO
			GROUP BY C.CNO, C.CNAME
			ORDER BY AVG(SC.RESULT) DESC
	) A
	WHERE ROWNUM <= 3;

--3) 학과별, 학년별, 기말고사 평균이 순위 3까지를 검색하세요.(학과, 학년, 평균점수 검색)
SELECT ROWNUM
	, A.MAJOR
	, A.SYEAR
	, A.AVG_RESULT
	FROM (
		SELECT ST.MAJOR
			, ST.SYEAR
			, AVG(SC.RESULT) AS AVG_RESULT
			FROM STUDENT ST
			JOIN SCORE SC
			  ON SC.SNO = ST.SNO
			GROUP BY ST.MAJOR, ST.SYEAR
			ORDER BY AVG(SC.RESULT) DESC 
	) A
	WHERE ROWNUM <= 3;

--4) 기말고사 성적이 높은 과목을 담당하는 교수 3인을 검색하세요.(교수이름, 과목명, 평균점수 검색)
SELECT ROWNUM
	, A.PNAME
	, A.CNAME
	, A.AVG_RESULT
	FROM (
		SELECT P.PNAME
			, C.CNAME
			, AVG(SC.RESULT) AS AVG_RESULT
			FROM PROFESSOR P
			JOIN COURSE C
			  ON C.PNO = P.PNO
			JOIN SCORE SC
			  ON SC.CNO = C.CNO
			GROUP BY P.PNAME, C.CNAME
			ORDER BY AVG_RESULT DESC
	) A
	WHERE ROWNUM <= 3;

--5) 교수별로 현재 수강중인 학생의 수를 검색하세요.
SELECT P.PNO 
	, P.PNAME 
	, COUNT(DISTINCT SC.SNO) 
	FROM PROFESSOR P
	JOIN COURSE C
	  ON C.PNO = P.PNO 
	JOIN SCORE SC
	  ON SC.CNO = C.CNO 
	GROUP BY P.PNO, P.PNAME ;