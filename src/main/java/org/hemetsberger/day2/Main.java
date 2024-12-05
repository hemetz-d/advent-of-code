package org.hemetsberger.day2;

public class Main {

    private static final String input = """
            67 69 70 71 72 75 74
            20 21 24 26 28 28
            43 45 48 50 53 57
            54 55 57 60 62 67
            23 26 24 27 28
            70 72 69 70 71 72 70
            3 5 8 10 8 9 11 11
            40 41 43 44 43 45 49
            22 24 27 30 31 29 31 36
            35 37 39 39 42 45 47 50
            81 83 83 84 85 83
            8 10 10 11 11
            85 86 86 87 91
            9 11 12 12 15 18 19 24
            84 87 89 93 94 95
            46 49 53 55 56 57 59 57
            65 67 69 71 73 77 77
            40 43 47 48 52
            69 70 74 75 78 81 82 88
            32 34 39 42 44
            56 59 60 67 69 67
            64 67 69 74 75 76 77 77
            20 21 24 31 35
            32 34 36 39 45 50
            57 56 57 59 60 63 64 65
            63 60 61 64 66 68 70 69
            11 9 12 13 16 18 18
            50 47 49 52 56
            15 12 13 16 19 21 26
            74 72 71 74 75
            76 73 70 72 69
            20 18 16 18 21 24 24
            23 20 23 25 28 30 27 31
            47 45 47 49 47 53
            16 14 17 17 18 19
            46 44 45 45 46 43
            65 62 62 65 67 68 68
            85 84 87 87 91
            80 79 79 80 86
            21 20 23 26 28 32 33
            61 58 62 63 65 63
            3 2 5 9 9
            73 70 74 76 80
            25 24 27 31 33 35 38 44
            31 30 37 40 42 45
            81 79 84 85 86 88 90 88
            6 4 6 8 13 14 14
            67 65 68 73 75 76 80
            42 40 43 49 51 52 55 61
            76 76 77 79 81 84
            57 57 60 63 64 66 69 66
            18 18 21 23 25 27 27
            59 59 61 64 68
            27 27 29 30 33 39
            79 79 81 78 79
            16 16 17 14 13
            45 45 43 45 45
            87 87 89 92 93 92 93 97
            69 69 70 71 74 73 74 81
            37 37 39 40 41 41 42 45
            10 10 12 12 9
            35 35 38 41 41 41
            64 64 66 69 69 72 73 77
            22 22 22 24 26 33
            5 5 9 10 13 16 18 19
            24 24 25 29 28
            41 41 42 46 46
            24 24 26 28 29 33 37
            4 4 5 9 11 14 16 23
            48 48 50 55 56 57 59
            22 22 23 28 29 30 32 29
            10 10 11 17 17
            33 33 36 43 46 50
            41 41 48 51 54 59
            36 40 42 44 47 50 52
            19 23 25 27 30 31 32 31
            44 48 49 51 52 53 55 55
            33 37 39 41 43 45 48 52
            12 16 19 22 25 26 31
            47 51 48 49 52
            37 41 43 44 41 43 46 43
            19 23 26 29 27 30 32 32
            10 14 11 13 17
            25 29 32 30 37
            64 68 68 70 73
            1 5 7 7 9 10 8
            21 25 27 27 27
            5 9 12 13 13 16 20
            65 69 69 71 72 75 77 82
            61 65 69 71 72
            57 61 62 65 67 71 69
            82 86 87 88 90 94 94
            79 83 85 89 90 93 97
            24 28 32 33 35 37 40 47
            71 75 81 83 86 87 90
            44 48 50 57 59 56
            49 53 54 55 60 60
            18 22 25 27 32 34 38
            51 55 57 58 64 66 72
            65 71 74 75 78 79 81 83
            13 19 22 25 28 31 29
            80 87 90 93 96 96
            11 16 17 20 21 23 27
            18 23 26 29 32 38
            86 91 93 92 95 98
            57 63 64 66 64 65 64
            73 78 79 76 78 80 82 82
            32 38 41 43 42 45 49
            78 83 86 84 87 92
            73 78 79 80 82 84 84 85
            64 71 72 74 75 76 76 73
            54 59 59 62 64 65 65
            51 58 61 63 66 67 67 71
            19 25 27 27 30 36
            21 27 30 32 36 38
            12 17 18 22 25 24
            43 49 51 52 53 57 60 60
            19 25 29 32 33 35 39
            47 53 54 58 63
            10 16 19 24 25 26
            25 30 33 40 42 41
            84 89 90 96 96
            3 10 12 15 21 25
            16 23 25 26 27 28 34 39
            57 56 54 53 51 49 46 49
            17 16 15 14 14
            27 25 23 21 20 16
            42 41 38 35 33 32 29 23
            83 82 80 77 75 73 75 74
            36 35 37 34 33 30 28 31
            7 6 4 1 2 2
            89 86 84 83 84 82 78
            67 66 64 61 59 62 55
            54 51 49 48 48 46 44 43
            60 59 59 57 59
            35 34 34 31 30 30
            29 27 26 24 24 20
            72 70 69 69 66 61
            25 23 22 18 15 13 10 9
            45 43 42 41 37 35 32 34
            98 95 91 88 88
            90 89 85 82 78
            25 24 23 19 18 11
            47 45 44 41 36 33
            48 46 44 42 39 37 32 33
            27 24 21 19 14 14
            64 62 56 54 50
            95 93 92 89 82 80 74
            92 94 91 88 87 86 85 84
            84 87 86 84 83 85
            58 59 56 55 52 50 50
            25 26 24 23 22 20 17 13
            14 15 14 13 11 9 3
            26 27 28 25 24
            35 38 35 32 33 35
            29 30 29 26 24 22 23 23
            53 55 56 53 49
            53 56 53 50 52 46
            44 45 45 42 41 39 38 36
            29 32 30 27 27 26 25 27
            24 26 23 23 20 18 17 17
            30 31 31 30 28 27 26 22
            74 77 74 73 72 70 70 63
            83 86 84 81 77 74 71
            16 17 15 12 8 11
            67 70 68 67 63 63
            42 43 41 39 37 33 29
            28 31 27 24 23 20 15
            76 79 73 70 67
            10 13 12 6 3 4
            71 73 71 69 67 65 59 59
            40 42 40 38 33 32 31 27
            95 96 89 88 82
            36 36 33 32 31
            29 29 26 24 22 21 23
            93 93 90 88 87 87
            89 89 87 84 80
            26 26 23 20 19 12
            72 72 75 74 72 69
            41 41 40 39 37 35 37 40
            5 5 4 2 5 3 3
            29 29 28 30 29 28 24
            96 96 93 95 90
            23 23 23 21 18 15 13
            75 75 74 73 72 72 69 70
            82 82 82 80 79 77 75 75
            56 56 55 53 53 49
            47 47 47 46 45 44 38
            30 30 29 26 22 21
            37 37 33 30 27 24 26
            57 57 53 50 48 46 43 43
            81 81 80 79 77 73 69
            67 67 64 61 57 55 49
            41 41 40 37 34 27 25
            35 35 30 29 26 23 20 22
            33 33 32 25 22 22
            30 30 23 21 17
            26 26 24 22 17 14 9
            80 76 75 72 70 68 66 65
            44 40 39 37 34 31 29 32
            69 65 62 61 61
            81 77 75 72 69 68 65 61
            51 47 45 44 41 34
            88 84 81 80 81 79 77 74
            65 61 62 61 60 59 56 57
            65 61 59 62 60 60
            65 61 62 61 60 59 55
            33 29 26 27 25 23 20 14
            33 29 29 27 25 23 22
            64 60 58 58 56 55 56
            72 68 65 65 64 64
            67 63 60 59 58 58 54
            41 37 35 35 30
            38 34 31 27 25 22 21 18
            18 14 12 8 11
            16 12 11 8 5 1 1
            77 73 69 67 63
            61 57 53 52 47
            82 78 76 70 68 66 63 62
            68 64 59 58 60
            79 75 68 65 64 62 60 60
            83 79 77 71 68 64
            20 16 11 9 3
            30 25 23 22 21 19
            97 90 89 88 85 86
            68 63 61 59 58 58
            36 29 28 27 24 21 19 15
            19 14 12 11 6
            60 55 56 54 51
            63 57 54 52 54 56
            25 19 18 17 18 16 16
            57 51 48 51 48 47 44 40
            33 27 28 25 22 20 14
            41 36 35 35 32 30
            58 51 50 47 46 46 47
            40 33 30 30 30
            75 68 67 67 66 65 62 58
            74 67 64 64 63 61 60 54
            37 30 26 24 23
            86 81 77 74 75
            20 13 9 8 5 4 2 2
            51 45 42 38 37 36 34 30
            77 72 70 68 64 58
            89 83 82 81 78 77 71 68
            25 18 12 9 8 11
            42 37 30 28 28
            73 66 60 57 54 50
            58 51 48 43 37
            34 37 38 39 42 45 43
            51 53 54 55 58 60 60
            41 43 46 49 52 54 56 60
            45 46 49 52 59
            91 92 95 93 94
            83 86 85 88 90 93 96 95
            66 68 67 69 70 71 72 72
            11 12 14 15 14 17 21
            43 46 44 46 49 54
            2 3 6 8 11 11 13 14
            17 20 22 22 19
            9 10 10 11 12 12
            83 85 87 88 88 92
            41 43 46 47 47 54
            61 62 64 68 69 70
            63 66 68 70 73 77 76
            55 56 60 61 64 66 69 69
            37 39 40 44 46 49 53
            39 41 44 48 51 54 55 60
            4 7 14 16 17 18 21 22
            38 41 43 44 49 46
            14 17 20 27 29 30 30
            34 35 37 39 44 45 46 50
            79 82 88 89 91 92 99
            62 61 62 65 68 69 70
            26 24 27 28 31 28
            64 63 66 68 71 71
            32 30 33 36 39 40 44
            30 28 31 33 36 43
            81 80 82 80 83 85 86
            47 44 46 49 50 49 51 49
            36 33 35 32 32
            58 56 55 56 60
            25 23 20 21 24 30
            27 25 26 29 31 31 32
            67 66 66 68 66
            58 57 57 59 59
            86 84 84 87 89 91 92 96
            18 17 19 21 22 22 25 30
            88 86 87 89 93 96
            29 27 29 30 31 35 32
            35 32 36 38 40 43 43
            38 35 38 42 44 47 51
            41 40 44 46 48 49 56
            82 80 81 87 89 91
            45 43 44 50 51 50
            8 5 10 12 15 15
            59 56 59 62 68 71 74 78
            7 5 7 12 13 14 21
            83 83 84 86 89
            77 77 80 81 84 81
            9 9 10 12 14 17 20 20
            28 28 31 32 35 38 40 44
            40 40 43 44 47 50 55
            51 51 53 55 56 53 55 56
            23 23 24 21 24 22
            44 44 47 48 46 46
            84 84 86 88 87 89 93
            69 69 67 68 74
            62 62 65 65 67
            69 69 70 70 72 71
            77 77 77 79 79
            21 21 24 24 28
            49 49 50 50 52 53 58
            27 27 29 33 36 39 40
            46 46 50 52 55 57 56
            31 31 35 37 40 42 42
            45 45 47 48 52 56
            2 2 5 9 16
            46 46 47 50 57 58
            70 70 72 75 81 79
            85 85 86 88 89 94 94
            33 33 34 36 42 46
            24 24 25 30 31 32 37
            83 87 88 90 93 95
            82 86 89 91 94 97 94
            39 43 45 48 50 50
            19 23 26 28 32
            2 6 7 8 11 13 14 19
            30 34 35 38 35 37 39
            73 77 79 77 80 83 80
            51 55 58 61 59 59
            69 73 74 75 73 77
            63 67 70 69 70 73 78
            33 37 40 40 43
            17 21 24 24 23
            9 13 16 16 17 18 18
            23 27 27 30 34
            69 73 73 74 77 78 83
            45 49 50 52 55 58 62 64
            3 7 11 14 16 19 22 21
            61 65 69 70 71 72 73 73
            77 81 84 85 86 90 92 96
            58 62 65 69 71 74 80
            36 40 42 48 50
            42 46 49 50 53 59 60 59
            38 42 47 48 49 49
            6 10 12 18 20 22 26
            44 48 55 56 58 64
            17 23 24 26 27 28
            75 80 82 83 84 87 90 87
            37 43 45 48 48
            18 24 25 28 32
            19 25 26 27 30 31 32 39
            17 23 24 26 28 26 27 28
            18 25 22 25 23
            25 31 32 35 37 36 37 37
            47 54 51 54 58
            33 40 41 40 42 49
            47 52 55 58 58 60
            52 57 57 60 59
            26 33 33 35 35
            8 14 14 15 17 21
            54 61 61 62 65 66 68 73
            38 44 48 50 53 56 59
            27 32 35 39 36
            83 90 93 95 99 99
            61 67 71 73 77
            76 81 85 87 92
            6 12 14 15 22 25
            5 11 12 17 14
            24 31 33 34 41 42 42
            74 79 80 83 86 92 96
            67 74 77 79 85 91
            81 79 77 74 77
            37 35 32 30 27 27
            73 72 69 66 62
            32 29 26 25 22 21 16
            16 13 15 13 12 11 9 6
            76 73 74 72 73
            28 26 25 26 23 21 21
            47 44 43 45 41
            39 37 34 31 33 27
            68 66 65 64 62 60 60 57
            9 7 6 6 7
            34 32 29 29 28 26 25 25
            69 68 68 66 65 62 58
            53 52 51 49 49 43
            20 19 17 13 10 7 4
            46 43 40 39 35 34 33 36
            51 50 46 45 45
            20 18 14 12 8
            30 29 26 23 21 17 15 8
            77 74 67 66 64 62 61 59
            19 17 14 8 11
            28 27 21 20 18 18
            91 90 87 80 76
            32 29 26 25 18 11
            67 70 67 65 64
            95 96 93 92 89 87 89
            18 21 18 17 14 14
            66 67 65 62 61 57
            18 21 19 16 15 14 8
            11 14 11 9 8 11 10 9
            89 91 90 91 90 91
            70 73 72 70 73 70 70
            11 13 12 10 13 10 9 5
            15 18 17 15 18 15 12 6
            32 34 32 29 27 27 24 21
            14 17 17 15 17
            55 56 54 52 49 48 48 48
            45 46 46 45 44 40
            64 65 63 63 62 57
            68 71 70 67 66 64 60 59
            50 53 51 49 45 48
            71 74 71 68 64 62 59 59
            29 30 26 25 21
            97 99 97 93 86
            82 85 84 78 75 73
            14 15 14 7 4 2 4
            64 67 66 64 63 62 57 57
            67 68 65 63 61 55 51
            35 36 35 33 27 25 24 17
            90 90 88 87 84 82
            21 21 19 16 13 14
            58 58 57 55 54 54
            75 75 73 70 67 65 61
            14 14 13 12 11 6
            83 83 81 78 76 78 77 74
            78 78 77 76 77 78
            40 40 39 36 33 32 34 34
            71 71 70 73 69
            62 62 65 64 63 60 55
            83 83 80 80 78
            92 92 91 89 86 86 85 87
            18 18 18 16 15 14 12 12
            15 15 13 13 9
            42 42 41 38 38 33
            80 80 77 73 72
            9 9 8 7 6 2 3
            78 78 76 74 73 69 69
            93 93 90 86 83 79
            52 52 48 47 41
            65 65 62 57 56 54 52
            71 71 70 64 66
            49 49 44 42 41 41
            57 57 55 52 45 41
            77 77 70 69 66 59
            55 51 49 47 44 42
            56 52 50 49 48 51
            90 86 83 82 80 80
            47 43 42 39 36 35 31
            83 79 77 74 72 67
            19 15 13 10 7 5 7 6
            19 15 13 15 14 13 10 12
            78 74 76 75 73 71 71
            53 49 52 49 46 45 41
            37 33 31 32 30 29 28 22
            14 10 10 9 6
            33 29 29 27 24 21 18 21
            99 95 92 92 92
            94 90 90 88 87 84 82 78
            29 25 24 21 21 19 18 12
            53 49 46 45 41 38 36
            19 15 14 12 10 6 8
            23 19 18 17 14 10 10
            93 89 87 83 79
            25 21 17 14 9
            82 78 73 71 70
            89 85 84 83 82 77 76 78
            30 26 19 16 15 15
            94 90 87 84 79 75
            31 27 26 25 18 15 9
            36 29 26 25 23 21
            56 51 48 45 44 41 39 40
            53 46 45 42 40 39 39
            67 60 59 57 56 53 51 47
            71 65 62 60 59 57 52
            23 17 16 19 17 15
            19 14 17 16 15 13 15
            59 54 52 53 52 51 51
            45 40 43 41 37
            70 64 61 60 59 62 55
            35 30 28 28 26 25
            31 26 23 22 22 19 22
            88 83 80 80 77 74 72 72
            62 55 53 53 50 48 46 42
            58 52 51 51 44
            66 59 55 52 49 47 46 44
            93 86 83 80 79 75 74 75
            46 40 38 34 34
            96 89 88 86 84 80 79 75
            79 72 68 65 60
            36 30 27 21 19 17 14
            35 28 26 19 20
            38 33 26 25 24 21 18 18
            31 26 21 20 17 16 15 11
            64 59 57 50 48 45 39
            42 44 45 48 51 54 53
            46 48 50 53 54 57 57
            60 63 64 66 67 70 71 75
            29 31 34 36 42
            40 41 43 44 47 46 47 49
            78 79 76 78 81 78
            8 11 13 11 12 12
            40 43 41 43 47
            25 27 29 32 33 36 35 41
            41 42 45 45 48
            6 9 10 10 13 12
            3 5 7 10 10 12 12
            80 82 82 85 87 91
            4 6 9 12 15 18 18 23
            34 35 38 42 44 47
            38 41 43 47 45
            30 32 34 38 39 39
            13 14 18 19 22 24 28
            28 31 34 36 40 43 49
            3 4 5 11 13 15 17 20
            77 78 84 87 88 91 94 93
            82 84 87 94 94
            24 27 29 32 37 38 42
            70 71 76 79 85
            28 26 29 32 35
            11 9 11 13 14 13
            36 33 34 35 37 37
            11 9 10 13 15 18 20 24
            66 65 68 70 73 79
            37 34 36 33 36
            25 23 25 23 25 26 28 25
            25 24 25 27 24 27 29 29
            52 50 49 50 54
            65 63 61 62 63 64 69
            53 51 51 53 55
            76 75 78 79 81 81 80
            90 87 88 88 88
            89 88 91 92 95 95 99
            85 82 83 85 86 87 87 93
            85 83 87 90 92
            8 5 8 11 15 13
            84 81 85 88 90 90
            13 11 15 16 19 20 24
            61 59 61 65 67 73
            31 29 31 36 37
            3 1 4 9 7
            28 25 32 34 35 37 37
            25 23 25 27 30 36 40
            43 42 43 44 50 56
            39 39 41 43 44 46 49
            72 72 73 75 72
            58 58 60 62 63 66 66
            56 56 58 60 62 64 68
            53 53 56 59 60 61 68
            82 82 81 83 84
            61 61 64 66 65 62
            5 5 6 9 6 6
            7 7 4 7 9 12 13 17
            56 56 53 55 56 57 62
            24 24 27 27 29
            15 15 16 19 19 21 24 21
            73 73 73 76 78 81 83 83
            40 40 42 42 46
            57 57 57 60 63 64 65 71
            86 86 89 93 96 97
            55 55 56 57 60 64 62
            39 39 43 46 49 51 54 54
            8 8 12 13 17
            46 46 50 51 52 59
            34 34 41 43 45 46 48 51
            60 60 61 67 68 69 66
            46 46 47 48 49 54 55 55
            3 3 10 11 13 16 20
            36 36 39 46 51
            15 19 21 24 25 26 29 30
            19 23 26 29 31 30
            39 43 46 48 48
            16 20 22 23 24 28
            20 24 26 29 32 35 42
            25 29 30 32 29 31 32
            66 70 68 70 68
            72 76 79 78 78
            92 96 94 95 99
            22 26 28 29 26 33
            87 91 91 92 93 94 95 97
            48 52 54 56 56 58 56
            85 89 90 90 93 93
            20 24 27 29 29 32 34 38
            72 76 76 78 84
            31 35 39 41 44 47
            16 20 24 27 26
            87 91 92 93 95 99 99
            62 66 70 72 76
            53 57 59 63 64 69
            81 85 87 92 94
            7 11 18 19 20 23 24 22
            37 41 48 51 52 52
            69 73 76 82 84 88
            43 47 54 57 60 61 66
            47 52 54 56 58
            2 8 9 11 9
            83 89 91 94 94
            51 58 61 64 68
            54 59 60 63 64 65 70
            81 88 89 86 89
            80 85 87 84 81
            36 43 45 46 48 50 48 48
            19 26 28 31 28 32
            31 36 37 38 39 38 44
            42 48 48 50 51 54
            11 16 17 19 22 22 25 24
            52 58 61 61 62 65 68 68
            79 84 84 86 88 90 94
            49 54 57 59 59 60 61 66
            32 39 40 44 46 49
            58 65 69 70 71 73 75 74
            3 8 12 15 17 19 19
            24 29 31 34 38 40 44
            62 67 70 73 77 80 87
            2 8 9 15 16
            3 8 11 14 15 21 19
            9 14 16 18 24 26 29 29
            48 55 58 60 61 66 68 72
            66 72 79 82 85 87 89 94
            85 84 82 81 79 78 75 77
            87 84 81 78 76 75 75
            35 34 33 32 30 26
            69 67 65 64 63 61 55
            51 48 47 44 46 43 40
            87 86 83 84 85
            42 40 42 39 39
            96 93 94 93 89
            48 47 50 48 47 41
            18 16 13 12 12 9
            65 64 62 62 60 59 60
            77 76 76 75 72 70 68 68
            46 44 44 41 40 36
            46 45 42 40 40 37 32
            26 24 23 19 17 15
            19 16 13 12 8 10
            28 26 25 24 21 17 17
            50 48 45 41 38 34
            24 23 21 18 17 13 6
            49 48 43 42 40
            35 33 30 25 26
            23 20 17 15 9 9
            65 63 62 61 54 51 47
            72 69 67 64 58 56 50
            76 77 75 73 72
            49 50 48 46 45 43 46
            52 53 50 48 48
            83 86 85 83 81 79 75
            24 26 23 22 15
            71 74 77 74 72 71 69 67
            29 32 33 31 33
            66 69 67 66 63 66 64 64
            90 93 91 90 91 87
            51 53 50 51 45
            14 16 13 11 11 9 7 6
            81 82 80 77 77 76 77
            7 9 9 7 6 3 3
            82 84 84 81 77
            63 65 63 61 61 59 57 50
            43 44 42 38 36 33
            50 52 48 47 45 42 41 44
            53 55 51 50 47 47
            61 64 61 57 55 51
            78 81 79 77 73 66
            42 44 42 39 32 31
            14 15 14 9 11
            92 93 92 86 83 83
            72 74 67 64 61 58 56 52
            49 50 47 45 43 41 34 29
            38 38 35 34 33 32 29
            70 70 69 68 65 64 62 64
            49 49 46 44 44
            17 17 15 12 11 8 5 1
            14 14 12 9 8 3
            27 27 28 25 23
            62 62 61 62 59 58 55 56
            60 60 59 61 59 57 56 56
            69 69 68 71 67
            75 75 78 77 75 70
            26 26 25 23 22 22 19 17
            85 85 82 82 81 78 81
            57 57 55 52 51 51 51
            10 10 10 9 5
            69 69 66 65 65 58
            41 41 39 36 32 31 29 27
            17 17 13 12 9 7 9
            32 32 31 27 27
            21 21 17 14 10
            74 74 73 70 68 67 63 57
            47 47 41 39 37 34 31
            49 49 46 45 40 39 40
            73 73 70 65 65
            35 35 34 31 26 22
            50 50 43 41 38 32
            34 30 27 25 22 19
            55 51 49 47 44 42 40 41
            42 38 36 35 32 29 28 28
            64 60 57 56 53 50 47 43
            54 50 49 48 46 44 41 35
            25 21 20 18 20 17
            97 93 94 91 94
            38 34 35 34 34
            51 47 45 47 46 43 42 38
            95 91 93 92 91 85
            41 37 36 34 34 32
            34 30 28 28 30
            51 47 47 44 44
            12 8 8 7 3
            97 93 91 90 90 88 87 80
            96 92 91 87 85 84
            87 83 81 78 76 73 69 70
            22 18 16 14 13 9 9
            77 73 72 69 65 61
            81 77 75 71 70 68 61
            71 67 62 60 57
            84 80 77 71 70 67 65 68
            73 69 66 65 59 59
            45 41 38 35 33 26 24 20
            31 27 25 19 17 14 12 5
            23 16 13 12 11
            78 72 70 68 69
            52 45 44 41 40 40
            67 61 58 55 53 49
            67 60 59 58 55 53 46
            50 45 43 44 42
            69 63 65 64 66
            97 90 93 90 89 86 83 83
            31 26 24 21 23 19
            42 37 35 37 34 32 29 24
            95 90 88 87 86 86 85 83
            43 37 35 35 34 31 33
            15 9 7 4 3 3 3
            84 78 75 72 72 71 69 65
            88 82 81 81 78 76 73 66
            22 15 14 10 7 5 4
            90 84 81 77 78
            93 86 83 79 78 77 75 75
            37 32 29 25 21
            76 70 68 66 62 61 56
            84 77 75 72 71 64 63 60
            90 85 83 81 75 72 70 71
            67 60 55 53 53
            47 40 38 31 27
            96 89 82 81 76
            99 95 91 88 87 85 83 79
            53 46 45 44 44 42 41 34
            53 53 54 60 63 64 67 71
            68 71 67 66 59
            56 63 64 66 69 72 72
            77 73 71 69 66 63 62 58
            12 15 12 11 8 6 9
            16 15 17 18 15 17 24
            30 29 30 34 36 40
            57 57 58 60 64 66 67 65
            43 43 46 47 48 49 47
            35 31 27 26 25 23 20 19
            38 45 47 48 49 48 51 58
            35 35 32 31 30 29 24
            49 47 44 41 38
            19 20 23 25 26
            88 85 83 82 79
            58 59 62 63 65 67
            7 9 10 11 13 14
            50 53 55 56 58 59
            99 97 94 91 89 87 85
            13 15 18 21 22 24 25
            60 57 55 52 51 48 47
            68 69 72 73 74
            83 84 85 88 90 91 94
            46 48 51 53 54 57 59
            51 52 55 57 59 62 65 68
            29 31 32 33 34 36 37
            52 54 57 59 61 64 67
            88 85 83 80 79 78 75 73
            31 32 34 35 37
            22 20 17 15 12 11 8 5
            67 68 69 71 73 76
            4 7 9 12 14 15
            36 39 40 43 46 49 50 51
            29 28 26 25 23 22 21 18
            17 19 21 22 23
            86 85 83 81 78
            20 17 15 12 11 9
            85 82 80 79 76 73 71 68
            60 61 63 64 66
            35 33 31 28 27 26 23
            51 54 55 58 59 62
            4 5 6 7 8 11 12
            57 59 60 61 62 64 66
            69 67 66 65 64
            72 73 76 77 79 82 83
            83 84 86 88 89
            41 44 45 47 48 49 51
            70 73 76 77 80
            89 86 85 84 82 81 78 76
            14 13 12 10 7 4
            78 77 76 75 72 71
            15 16 18 19 21
            41 44 45 47 48
            76 79 81 84 86 87 90 93
            54 51 48 46 43 41 39
            14 11 10 7 5
            46 48 51 53 56 57 60 63
            99 98 97 95 93
            23 22 19 16 15 13 11
            54 53 52 50 47 44 42
            43 41 40 37 36 34 32 29
            66 67 70 73 74 77 78
            57 58 61 63 66 69
            41 40 38 36 35 34
            55 54 53 50 48 47 44 41
            81 79 78 77 74 71
            33 34 35 36 39
            90 87 85 84 83 81
            35 33 31 28 27 25
            55 53 50 48 45 42 39
            71 73 75 78 81 82 83
            36 33 32 30 28 27 24 23
            37 34 32 31 30 27
            55 54 53 52 50 47 44 42
            42 41 39 37 36 35
            14 11 9 8 6 3
            45 42 41 40 37 35 32
            69 67 66 63 60 57 55 53
            17 19 22 25 26 27
            70 73 75 76 77 79 80 82
            65 64 61 59 58 56 54 53
            78 80 81 84 86 88 91
            1 4 6 9 11 13 16
            32 31 29 28 25 23 22
            36 37 40 42 43
            34 36 38 39 42 43 45
            81 84 87 90 92 95 97
            12 14 16 17 18
            38 40 42 43 44 45 47
            4 6 8 10 11 14 16 19
            98 95 94 93 91 90
            52 51 49 46 44
            35 37 40 43 44
            84 83 81 80 78 75
            58 60 61 64 67 68 69 70
            58 55 52 50 48 45 42 39
            95 94 93 91 90
            91 90 89 86 85 83 81
            48 51 53 55 58 61
            40 42 45 48 51 53 55
            77 80 81 83 85 86 88
            47 49 52 54 55 57
            55 53 50 49 47 44 43 42
            63 65 67 69 70 72 73
            30 27 25 24 22 21
            78 80 82 84 87 90 92 94
            54 53 52 51 49 46
            77 74 73 70 68 65 63 61
            96 95 93 90 87
            48 49 51 52 54 55
            75 78 79 80 82 83
            61 64 67 69 72 74
            74 72 69 67 65 62
            35 36 38 39 40 41
            61 64 66 67 69 70 72 75
            53 52 51 50 48 45 44 42
            16 17 19 20 22 23 26 27
            88 91 92 94 96
            50 52 55 56 57 60
            62 64 67 69 72 75
            7 9 11 14 16 19 21 24
            32 31 30 27 24 22 19 16
            82 79 77 75 73 72
            60 58 56 54 53 51 48 47
            23 26 28 31 33
            92 91 88 87 86 84 82
            90 89 88 87 86 84 83 80
            77 79 80 83 85 88 90
            78 79 81 84 85 88 91
            42 39 37 34 31 29 26
            78 77 75 72 71 70 67 65
            64 67 68 71 73
            17 20 21 22 24
            58 56 54 53 52 50
            30 33 35 36 38 40 42
            71 68 65 62 61
            29 27 25 23 22 19
            41 39 38 36 35 33 32
            93 90 89 87 84
            41 39 38 37 34 31 28 26
            29 28 25 24 22 20 19 16
            35 38 39 42 45
            81 82 85 86 88 91
            34 35 37 40 42 45 48
            68 70 71 72 74 75 76 79
            11 14 15 17 18 19 20 21
            32 29 26 23 21
            92 90 87 84 82
            83 82 80 77 74 73
            88 89 90 93 94 96 99
            42 45 48 51 54 55 58 61
            83 85 86 87 90 93 94 96
            42 45 47 49 52 55 58
            11 13 14 15 18 19 22
            23 20 18 15 13 11 10 7
            47 44 41 40 37
            26 25 23 21 18 15
            3 5 6 7 8 10 11 12
            59 60 63 64 66 67 69
            92 90 87 86 85
            99 96 95 93 92 90 89
            73 70 68 67 64
            44 41 40 39 38 37 36 34
            30 33 35 38 41 42 45 46
            92 90 88 86 85
            98 96 93 90 87 85
            55 52 51 50 48 46 43
            85 86 88 91 93
            65 62 61 58 57 56 55 53
            25 28 31 32 35 38
            24 27 30 33 35
            70 67 64 62 59
            26 28 31 34 36 37 39 40
            94 93 92 91 90 89 86
            22 25 27 28 29 30 33 36
            44 47 50 52 54 55 58 60
            64 61 58 57 54 51 48 46
            26 24 23 21 19
            34 33 32 30 27 24 22
            24 26 29 31 34 35 37
            99 98 95 94 93 92 91 90
            44 42 39 38 35 33 31
            68 66 64 61 58 56 53
            19 17 14 12 9 7 5 3
            72 69 67 66 65 62 60
            41 44 45 46 48 51 53 55
            17 18 21 24 27 29 32
            71 73 76 79 80 83 86
            10 13 16 17 19 21 22 24
            46 43 40 38 35 34 31
            51 53 56 57 60
            23 25 27 28 30 31
            98 95 92 91 89 86
            60 57 55 54 53 52 49 48
            26 27 30 33 35
            41 39 38 36 34
            41 38 37 35 32 29 27
            89 92 95 97 98
            81 80 77 74 71 68 67
            12 13 15 17 20 21
            95 92 89 86 83 82
            20 18 17 16 14 11
            14 15 16 17 20 23 24 25
            91 89 86 83 81 79 78 76
            7 8 10 13 16
            21 22 25 26 28 31 34
            27 30 31 33 35 37 39
            50 53 54 55 56 58 60
            89 92 95 96 98
            59 57 56 54 53 52 50
            28 27 24 23 21 19
            77 78 79 82 85
            93 91 90 87 85 83 81
            56 55 53 51 48 45 42 40
            13 12 10 7 5 3 1
            40 42 45 48 49 50
            51 50 48 46 44 41 39 37
            77 79 80 83 85 86 87 90
            61 60 57 56 53 52 51 50
            28 25 23 21 20 19
            58 57 54 51 50 48 45 43
            54 57 58 59 61 63
            87 86 84 83 81 80 79 77
            4 6 8 11 13 16 17 19
            48 47 45 44 42 39
            13 15 17 19 21 24 25 27
            82 80 79 78 75 74
            90 88 85 82 81 79 76 75
            68 67 64 61 59
            90 93 94 96 98 99
            45 44 43 41 39
            9 12 13 15 18 19 20
            77 79 82 83 86 87
            17 15 12 11 8 6 3
            1 4 5 8 10 13 16
            50 49 48 46 43 41 40
            45 44 42 40 39 38 37
            20 23 25 26 29 32 35
            62 65 66 68 70
            22 24 25 27 30 33 36
            20 18 15 13 10 9 6
            65 63 62 61 58 55 54 51
            15 13 12 10 9 6 5
            28 26 25 23 20 17 15 13
            80 81 82 83 86
            85 82 80 78 76 73
            25 22 21 19 17 15 12
            52 54 55 58 60 61 62 65
            77 79 82 85 87
            36 33 32 31 28
            43 44 45 47 49
            12 15 17 18 21 22 24 26
            19 16 14 11 10 9
            67 68 70 71 74 76""";

    public static void main(String[] args) {
        String[] reports = input.split("\n");
        int safeCtr = 0;
        for (String report : reports) {
            if (isSafe(report))
                safeCtr++;
        }
        System.out.println(safeCtr);
    }

    public static boolean isSafe(String report) {
        String[] levels = report.split(" ");
        boolean safe = true;
        Boolean asc = null;
        for (int i = 0; i < levels.length; i++) {
            int current = Integer.parseInt(levels[i]);
            if(i + 1 < levels.length) {
                int next = Integer.parseInt(levels[i + 1]);
                if (asc == null)
                    asc = (current - next) < 0;
                if (!isDiffOK(current, next) || !isOrderOK(current, next, asc)) {
                    safe = false;
                    break;
                }
            }
        }
        return safe;
    }

    private static boolean isDiffOK(int a, int b) {
        return Math.abs(a - b) > 0 && Math.abs(a - b) <= 3;
    }

    private static boolean isOrderOK(int current, int next, boolean isAsc) {
        return isAsc == ((current - next) < 0);
    }
}
