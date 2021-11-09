SELECT T1.*,
    NAME
FROM (
        SELECT SUBMISSION_DATE,
            COUNT(T1.HACKER_ID) QT_HACKERS,
            MAX(HACKERID) HACKERID
        FROM (
                SELECT SUBMISSION_DATE,
                    CASE WHEN DIA = DIAS THEN HACKER_ID END HACKER_ID,
                    QT_SUBMISSION,
                    HACKERID
                FROM (
                        SELECT SUBMISSION_DATE,
                            TO_CHAR(SUBMISSION_DATE, 'DD') DIA,
                            LPAD(
                                ROW_NUMBER() OVER(
                                    PARTITION BY HACKER_ID
                                    ORDER BY SUBMISSION_DATE
                                ),
                                2,
                                '0'
                            ) DIAS,
                            HACKER_ID,
                            QT_SUBMISSION,
                            CASE
                                WHEN ROW_NUMBER() OVER (
                                    PARTITION BY SUBMISSION_DATE
                                    ORDER BY QT_SUBMISSION DESC,
                                        HACKER_ID ASC
                                ) = 1 THEN HACKER_ID
                            END AS HACKERID
                        FROM (
                                SELECT SUBMISSION_DATE,
                                    HACKER_ID,
                                    COUNT(*) AS QT_SUBMISSION
                                FROM SUBMISSIONS
                                -- WHERE SUBMISSION_DATE IN('2016-03-01', '2016-03-02')
                                GROUP BY SUBMISSION_DATE,
                                    HACKER_ID
                            )
                    ) T1
            ) T1
        GROUP BY SUBMISSION_DATE
    ) T1
    LEFT JOIN HACKERS T2 ON T1.HACKERID = T2.HACKER_ID
ORDER BY SUBMISSION_DATE;