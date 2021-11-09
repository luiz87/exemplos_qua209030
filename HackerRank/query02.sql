SELECT T1.COMPANY_CODE,
    FOUNDER,
    COUNT(DISTINCT T2.LEAD_MANAGER_CODE),
    COUNT(DISTINCT T2.SENIOR_MANAGER_CODE),
    COUNT(DISTINCT T2.MANAGER_CODE),
    COUNT(DISTINCT T2.EMPLOYEE_CODE)
FROM Company T1
    INNER JOIN EMPLOYEE T2 ON T1.COMPANY_CODE = T2.COMPANY_CODE
GROUP BY T1.COMPANY_CODE,
    FOUNDER
ORDER BY T1.COMPANY_CODE;
SELECT X,
    Y
FROM (
        SELECT X,
            Y,
            COUNT(*) QT
        FROM(
                SELECT X,
                    Y
                FROM FUNCTIONS
                UNION ALL
                SELECT Y,
                    X
                FROM FUNCTIONS
            ) -- WHERE X <= 25
        GROUP BY X,
            Y
        ORDER BY X,
            Y
    )
WHERE(
        (
            X <> Y
            AND QT >= 2
        )
        OR (
            X = Y
            AND QT > 2
        )
    )
    AND X <= Y;
WITH TB1 AS (
    SELECT 1 C1
    FROM DUAL
    UNION ALL
    SELECT 1 C1
    FROM DUAL
    UNION ALL
    SELECT 1 C1
    FROM DUAL
    UNION ALL
    SELECT 1 C1
    FROM DUAL
    UNION ALL
    SELECT 1 C1
    FROM DUAL
),
NUMEROS AS (
    SELECT ROWNUM NUMERO
    FROM TB1 T1,
        TB1,
        TB1
)
SELECT RPAD('* ', NUMERO * 2, '* ')
FROM NUMEROS
WHERE NUMERO <= 20
ORDER BY NUMERO desc;
--
SELECT CITY,
    TAMANHO
FROM (
        SELECT A.*,
            MIN(TAMANHO) OVER(PARTITION BY ORDEM) MENOR,
            MAX(TAMANHO) OVER(PARTITION BY ORDEM) MAIOR
        FROM (
                SELECT CITY,
                    TAMANHO,
                    ROW_NUMBER() OVER(
                        PARTITION BY TAMANHO
                        ORDER BY CITY
                    ) ORDEM --, MAX(TAMANHO) MAIOR
                FROM (
                        SELECT CITY,
                            LENGTH(CITY) TAMANHO
                        FROM STATION
                        ORDER BY CITY
                    )
            ) A
        WHERE ORDEM = 1
    )
WHERE TAMANHO = MENOR
    OR TAMANHO = MAIOR;