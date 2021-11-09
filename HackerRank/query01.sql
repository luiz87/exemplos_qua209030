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
        TB1,
        TB1,
        TB1
),
PRIMOS AS (
    SELECT NN1,
        COUNT(*)
    FROM (
            SELECT T1.*,
                MOD(NN1, NN2) RESTO
            FROM (
                    SELECT N1.NUMERO NN1,
                        N2.NUMERO NN2
                    FROM NUMEROS N1,
                        NUMEROS N2
                    WHERE N1.NUMERO >= N2.NUMERO
                ) T1
        ) T1
    WHERE RESTO = 0
        AND NN1 > 1
        AND NN1 <= 1000
    GROUP BY NN1
    HAVING COUNT(*) = 2
    ORDER BY NN1
)
SELECT LISTAGG(NN1, '&') WITHIN GROUP (
        ORDER BY NN1
    )
FROM PRIMOS;