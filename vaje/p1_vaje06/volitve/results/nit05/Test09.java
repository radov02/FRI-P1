
public class Test09 {

    public static void main(String[] args) {
        int[][][] volitve = {
            {
                { 32,  79, 978,  30, 800, 811,  59, 813, 904, 252, 658, 345, 624, 929, 440, 408, 931, 899,  95, 983, 643, 223, 693},
                {690,  46, 114, 586, 498,   7,  46, 566, 932, 784, 346, 969, 400, 555, 726, 368, 811, 230, 554, 436,  50, 964, 321},
                {348, 293, 812, 842, 959, 914,  73, 205, 855, 329, 818,  13, 548, 133, 630, 163,  18, 602, 810, 802, 121, 876, 900},
                {774, 167, 670, 625, 544, 194, 175, 661, 370, 251, 203, 500, 211,  19, 563, 942, 511,  27, 231, 898,  14, 978,  43},
                { 68, 563, 726, 682, 152, 110, 638, 757, 650, 973, 358, 673, 513, 167, 486, 491,  60, 892, 430, 825,  88, 650, 381},
                {158, 654, 417, 305, 447, 966, 603, 836, 793, 703,  90, 689, 215, 266, 521, 472, 319, 673,  67, 145,  70, 775, 114},
                {488, 692,  98, 785,  29, 964, 141, 731, 650, 551, 388, 280, 614, 103, 457, 495, 692, 271, 288, 515, 439, 135, 569},
                {632, 201, 879, 145,  97, 730,  30, 130, 728, 705, 138, 857, 698, 240, 230, 246, 459, 456, 575, 516, 298, 818, 985},
            },
            {
                {189, 467, 772, 790, 306, 651, 713, 555,  79, 820, 979, 556, 791,  26, 861, 369, 373, 248, 919, 524, 923, 318, 135},
                {465, 181, 723, 552, 933, 972, 525, 439, 567, 853,  79, 748, 999, 397, 661, 587, 459, 433, 831, 739, 960, 910, 476},
                {103, 129, 367, 122, 376,  63, 821, 612,  22, 851, 589, 126, 313,  18, 127, 907, 175, 228, 178, 730, 817, 162,   8},
                {189, 393, 681,  88, 963, 336,  41, 260, 167,  14, 623, 665,  80, 829, 849, 980,  15, 289, 323, 736, 771, 787, 381},
                {876, 322, 220, 498, 404, 611, 667, 639, 301, 115, 800,  26, 423, 376, 609, 647, 311, 616, 191, 380, 654, 782, 100},
                {862, 877, 148, 933,  11, 897, 505, 100, 694, 239, 492, 123, 370, 785, 311, 393, 250, 233, 121,   2, 728, 329, 186},
                { 70, 354, 606, 348, 981, 453, 738, 486, 213, 706, 833,  11, 724, 615, 276, 247, 526,  89, 638, 687, 388, 973,  17},
                {266, 460, 913,  17, 397, 709, 582,  56, 127, 210, 481, 401, 625, 703,  48, 922, 459,  59, 481, 312, 294,   4, 603},
            },
            {
                {905, 593, 870,  90, 970, 552, 195, 303, 307, 180, 174, 277, 544, 462, 734, 185, 380, 584, 177, 478,  67, 412, 829},
                { 57,   4, 647,  14, 334, 475, 728, 143, 432, 124, 556, 181, 449, 637, 265, 658,  90,  53, 945,   1, 303, 637, 201},
                {909, 512, 337, 113, 622, 512, 718, 665, 693, 182, 309,  18, 686,  32, 311, 247, 675, 221, 594, 939, 503, 260, 637},
                {272, 608, 570, 384, 649, 146, 991, 130, 459, 217, 709,   5, 197, 787, 872, 645,  54, 723, 673, 282, 679, 260, 677},
                {643,  29, 756, 370, 897, 149, 498, 986, 772, 222,   9, 483, 145, 690, 410, 107, 178,  19, 876, 877, 869, 428, 440},
                {247, 933, 729, 970, 735, 161, 367, 658,  34, 591, 776,  11, 228, 660, 685, 144, 231, 857, 702, 193, 837, 575, 605},
                {158, 349, 224, 575, 508, 280, 240, 235, 988, 888, 523, 836, 565, 554, 779, 430, 452, 622, 451, 332, 799,  48,  64},
                {285, 171,  62, 485, 141, 806, 488, 266, 279, 415, 327, 997,  82, 631, 770, 203, 408, 590, 219, 548, 732, 931, 126},
            },
            {
                {990, 409, 794, 378, 764, 818, 956,   3, 781, 655, 552, 258, 487, 889, 776, 699, 457, 253, 823, 897, 904, 886, 881},
                {807, 772, 494, 176, 833, 748, 568, 657, 340, 961, 203, 178,  31, 706, 216, 869, 862, 281, 381, 553, 225, 792, 959},
                {819, 889, 732, 779, 629, 296, 696, 191, 624, 962, 893, 100, 173,  88, 361, 734, 818, 168, 509, 654, 396, 983,  46},
                {281, 756, 370, 392, 330, 891, 996, 251, 837, 212,  96, 828,   0, 932, 768,  45,   3,  16, 977, 927, 662, 349, 545},
                {837, 268,  45, 389, 966, 369, 941,  93, 746, 592,  58, 675, 554, 989,  73, 106, 189, 295, 549, 140, 656, 263, 182},
                {191, 901,  83, 394, 250, 210, 414, 826, 628, 102, 868, 388, 171, 232, 335,  13, 386, 715, 730, 335, 979,   7, 799},
                {935, 493, 391, 478, 493, 929, 671, 845, 343, 351,  90, 369, 952, 540, 604, 209, 983, 567,  59, 515, 898, 361, 918},
                {402, 999, 206, 945, 918, 667, 293, 970, 369, 327, 938, 370, 811, 378,  10, 996, 432, 981, 569, 181, 547, 935, 284},
            },
            {
                {543, 180, 644, 176, 237, 945, 565, 825, 231, 906,  51, 780, 928, 454, 151, 836, 881,  71, 610, 675, 353,  35, 432},
                {113, 664, 925, 698, 696, 757, 423, 339, 974, 331,  84, 322,  76, 370, 100, 685, 603,  52, 995, 709, 593, 866, 774},
                {964, 697, 967, 617, 609, 318, 314, 185, 310, 288, 887, 597, 921, 493, 232, 717, 940, 367, 858, 382, 674, 948, 114},
                { 60, 873, 138, 633, 607, 739, 892, 608,  94, 229, 399, 873, 661, 945, 466, 226,   6, 776, 198, 416, 887, 272, 307},
                {192, 369, 134, 816, 950, 395, 953, 595, 147, 533, 757, 338, 793, 471, 437, 533, 899, 609, 253, 124, 262, 679, 414},
                {610, 830, 989, 561, 921,   3, 772, 259, 768, 301, 370, 830, 914,  81, 501, 369,  55, 908, 160, 839, 348, 311, 985},
                {151, 794, 714, 733, 704, 137, 579, 469, 509, 439, 890, 103,  49, 156, 552,  21, 470, 641, 173, 821, 384, 385, 701},
                {673, 666, 495, 869, 169, 446, 213, 454,  49, 756, 525, 587, 544, 204, 900, 245, 662,  22, 521, 699, 966, 502, 624},
            },
            {
                {  0, 100, 827, 800,  41, 559, 333, 931, 922, 489, 364, 744, 215,  40, 728, 516, 481, 792, 217, 505, 472, 674, 818},
                {457, 133, 235, 513, 485, 947, 981, 159, 505, 795, 589, 256, 466,  61, 359, 662,  49, 560, 861, 820, 403, 669, 415},
                {397, 661, 924, 664, 579, 248,   8, 519, 922, 232, 236, 251, 980, 710, 961, 465, 690, 682, 813, 486, 502,   7, 935},
                {683, 184, 175, 972,  54, 937,  79, 331, 665, 917, 946, 121, 272, 294, 594, 478, 491, 371,  69, 353, 116, 748, 779},
                {506, 318, 382, 864, 367, 197, 472, 995, 738, 707, 544, 742, 531, 822, 102,   5, 663,  61, 954, 338, 118, 202, 448},
                {423, 355, 772, 369, 838, 231, 823, 384, 134, 477, 500, 993, 175, 331, 812, 261, 904, 460, 211, 137, 226, 156, 388},
                {425, 343, 698, 335,  93, 764, 954,  63, 299, 486, 460, 465, 997, 149,  75, 986, 338,  21, 373, 552, 461, 995, 581},
                {858,  67,  75, 679,   9, 336, 759, 468, 299,  65, 687, 652, 394, 429, 675, 944, 686,  29,  84, 824, 375, 196,  37},
            },
            {
                {876, 103, 205, 128, 991, 927, 495, 283, 470, 793, 893, 349, 677, 329, 180, 897, 815, 118, 686, 719, 272, 687, 920},
                {250, 200, 854, 426, 105, 220, 634, 354, 175, 863, 393, 446,  53, 861, 328,  21, 925,  19, 726, 575, 521, 595, 377},
                {889, 173, 276, 331, 949, 115, 717, 982, 760, 567, 423,  84, 781, 123, 812, 869, 608, 912, 194, 915, 424,  63, 569},
                {166, 623, 268, 519, 604,  95, 920, 977, 661, 421, 495, 375, 605,  53, 622, 732, 976, 403, 138, 846, 455, 667, 349},
                {188, 432, 282, 938, 420, 417, 874, 621, 119, 816, 167,  16, 649,  72,  63, 959, 317, 774, 879, 962, 683, 123, 711},
                {442, 838, 372, 959,  11, 228, 844, 219, 728, 483, 390, 622, 550, 787, 771, 440, 919, 893, 935, 376, 334, 642, 820},
                {705, 995, 298, 191,   2, 129, 136, 352, 857, 331, 618, 156, 446, 589, 250, 845,  87, 830, 987, 128, 642, 408, 483},
                { 96, 677, 502, 880, 680, 558, 806, 705, 219, 385, 994, 587, 424, 818, 824, 318, 584, 456, 658, 742, 871, 536, 135},
            },
            {
                {153,  71, 874, 925, 614, 805, 296, 645, 714, 235, 837,  77, 559, 933, 591, 492, 715, 716, 883, 440, 683, 444, 666},
                {288, 133, 145, 588, 388, 605, 834, 521, 498, 447, 736,  18, 772, 325, 858, 102,  29, 312, 201, 481, 571, 844, 472},
                {847, 747, 307, 500,  68, 301, 785, 824, 817, 443, 322, 171, 595, 428, 847, 325, 341, 964, 195, 797, 560, 423, 606},
                { 92, 792, 473, 326, 540, 872, 748, 127, 642, 161, 672, 383, 838,  59, 969, 282, 852, 790, 268, 112, 701, 128, 599},
                {380, 426, 780, 544, 175, 488, 600, 620, 191, 948, 649, 428, 216, 820,  47, 672, 341, 272, 326, 659, 162, 943,  91},
                {919, 187, 182, 272, 595,   2, 472, 972, 826, 382, 655, 903, 580, 242,  99, 342, 363, 355, 795,   7, 836, 507, 617},
                {292, 680, 464, 943, 949, 629, 120, 231, 327, 492, 461,  85, 376, 876, 996, 803, 232, 122, 265, 932, 602, 897, 247},
                {808, 305, 761, 399, 274, 623,  60, 274, 423, 518, 546, 903, 426, 548, 813, 306, 822, 893, 213, 501,  75, 187, 916},
            },
            {
                {773, 894, 990, 219, 436, 392, 836, 689, 511, 436, 710, 849, 988, 920, 664, 724, 749, 648, 446, 461, 740, 233, 801},
                {600, 894, 499, 238,  14, 311, 613, 715, 736, 435, 834,  38, 788,  63, 630, 210, 441, 398,  88,  93, 530, 210, 508},
                {833,  66, 796,  68, 308, 671, 564, 287, 998, 556, 684, 379, 626, 473, 833, 987, 489, 312, 921, 305, 776, 247, 298},
                {857, 369, 911, 695, 905, 120, 503, 323, 373, 843, 635, 249, 118, 905,  94, 379,  40,  15, 805, 730, 482, 383, 641},
                {539, 115, 246, 487, 901, 748, 336, 688, 144, 584, 472, 207,  70, 127, 209, 707, 359, 545, 226, 143, 497, 200, 995},
                {790, 485, 967, 900, 111, 215, 140, 718, 903, 411, 840, 777, 159, 589, 969, 587, 529, 214, 175, 846, 942, 735, 906},
                {441, 930, 619, 165, 966, 869,  55, 781,  81, 582, 781, 607, 113, 498, 131, 360, 536, 216, 304, 756, 354, 605, 356},
                { 68, 710, 338, 872, 351, 929,  46, 444, 141, 769, 481, 211, 511, 450, 692, 176, 189,  49, 885, 420, 448, 247, 145},
            },
            {
                {586, 112, 864, 819,  33, 487, 642, 374, 911, 481, 929,  99, 948, 795, 399, 722, 360, 939, 695,  84, 181, 765, 913},
                {387, 765, 835, 561, 749,  49, 594,  93, 291, 344, 974, 299, 543,  23, 938, 773, 921, 456, 456, 726, 704, 751, 524},
                {700,  29, 164, 120, 379, 879, 919, 624, 555, 700, 695,  73, 283,  51, 174, 359, 290, 553, 269, 478, 578, 208, 210},
                {612, 269, 991, 736, 579, 821, 288, 468, 445, 149,  29, 714, 286, 698, 921,  93, 889, 343, 932, 541, 318, 986, 339},
                { 35, 291, 943, 200, 338, 410, 970, 268, 855, 777, 181, 721, 574, 875, 849, 412, 237, 157,  75, 414, 811, 168, 331},
                { 44, 477,  38, 907, 822, 219, 608, 478,  37, 729, 608, 531, 945, 201,  72, 559, 617, 547, 766, 866, 389, 624, 399},
                {702, 489, 692, 946, 937, 232, 160, 402, 583, 485, 571, 443, 228, 775, 429, 585, 402, 548,  67, 935, 677, 504, 763},
                {752, 495, 718, 760, 289, 945, 667, 119, 607, 967, 820, 880, 812, 462, 789, 798, 630, 491, 961, 405, 683,  89,  29},
            },
            {
                {450, 279, 314, 315, 929, 119, 924,  82, 786,  89, 634, 218, 562,  26, 950, 590, 645, 354, 941, 295, 555, 427, 220},
                {414, 532, 532, 591, 205, 642, 148, 346, 872,  14,  28, 701, 760, 807, 495, 527, 366, 792, 552, 243, 226, 495, 430},
                {841, 496, 567, 915, 504, 266, 689, 957, 682, 297, 368, 676, 141, 525, 120, 912, 486, 580, 660, 192, 638, 258, 412},
                {156, 778, 202, 562, 244, 450, 335, 499,  30, 225, 307,  87, 167, 393, 862, 794,  43, 681, 143, 991, 265, 417, 783},
                {790,  28,  37, 769, 335, 945, 572, 586, 238, 517, 290, 585, 494, 253, 922,  32, 341, 759, 426, 714, 505, 970, 771},
                {604, 162, 440, 268, 175, 959, 898, 483, 401, 163, 637, 958, 995, 739, 354, 789, 276, 996, 751, 689, 224, 298, 591},
                {457, 584, 337,  80, 370,  48, 431, 416, 114, 179, 189, 679, 648, 105, 568, 309, 707, 689, 934,  62, 432, 660, 316},
                {109, 378, 511, 741, 525,  98, 986, 412, 385, 732, 414,  92, 275, 620, 407, 512, 241, 611, 847, 858,  42, 799, 833},
            },
            {
                {482, 592, 619, 132,  25, 351,  86, 791, 747,   6, 378, 346, 185, 279, 223,  90, 643, 158, 463, 884, 889, 444, 278},
                {568, 200, 266, 368,  93, 198, 553, 967, 376, 821, 459, 509, 858,  83, 749, 740, 588, 114,   9, 965, 286, 101, 516},
                {167, 747, 532, 321, 419, 450,  99, 586, 386, 133, 384, 759, 246, 914, 301, 690, 372, 606, 375, 127, 587, 744, 131},
                {141, 823, 262, 349, 740, 495, 816, 979, 411,  76, 103,  90, 877, 540, 708, 581, 760, 810,  98,  64, 828, 244, 685},
                {629, 437, 340, 609, 524, 897, 674, 487,  16, 356,  94, 552, 661, 146, 341,  17, 827,  55,  74, 855, 474, 163, 204},
                {321, 603, 903, 973, 618, 904, 323,  74, 623, 741, 757, 980, 116, 916, 959, 708,   7, 296, 617, 773, 315, 672,  81},
                {536, 804, 775, 239, 209, 906, 820, 447, 429, 123, 542, 509, 963, 218, 434, 212, 178, 589, 711,   4, 922, 488, 769},
                {789, 976, 733, 713, 944, 119, 378, 103, 778, 765, 832, 648,  92, 958, 311, 676,  37, 358, 615, 961, 317, 326, 274},
            },
            {
                {240, 346, 154, 529, 869, 573, 692, 746, 541, 293, 979, 491, 454, 726, 799, 901, 305, 762, 338, 651, 118, 367, 338},
                {939, 698, 210, 794, 376, 659, 321, 552,  11, 635, 329, 491, 657, 837, 410, 537, 828, 383, 484, 269, 888, 577, 969},
                {488, 591, 793, 210, 516, 424, 364, 946, 203, 492, 848,  38, 969, 226, 907, 341, 514, 780, 559, 810, 529, 538, 574},
                {460, 682, 879, 604, 314, 820, 703, 776,  43, 241, 456, 172, 727, 447, 940, 336, 350, 892, 576, 787, 666, 916, 660},
                {415, 143, 918,  66, 158, 478, 299, 557, 358, 139, 566, 835, 699, 871, 297, 553, 156, 264, 851, 568,  15, 595,  97},
                {217, 915, 157, 629, 601, 556, 914, 472, 176, 124, 240, 488, 516, 262, 863, 273, 118, 534, 966, 816, 589, 895, 811},
                {211,  33, 117, 560, 850, 591, 322, 341, 819, 838, 983, 712,  53, 575,   6, 671, 945, 166, 863, 386, 720, 832, 840},
                {258, 252,  66, 513, 630, 464, 784, 848, 198, 963, 137, 117, 237, 943, 628, 818, 667, 857, 258, 778, 335, 934, 317},
            },
            {
                {222, 552, 674, 961, 234, 502, 364, 758, 165, 133, 723, 103, 101, 922, 815, 103, 429, 837, 596, 997, 725, 978, 794},
                {581, 576, 640, 791, 581, 185, 150, 248, 487, 519, 227, 869, 624, 559,  14, 894, 519, 202, 706, 991, 283, 593, 862},
                { 36, 940, 377, 342, 380, 455,  45, 867,  74, 381, 412, 107,  58, 469, 886, 265, 663, 577, 719, 811, 371, 598, 531},
                {197, 965, 542, 364, 586, 284, 582, 263, 504, 316, 964, 768, 424, 127, 530, 590, 353, 637, 886, 631, 602, 731, 963},
                {152, 709, 405, 679, 777, 671, 750, 740, 122, 244, 458, 707,  85, 247, 530, 620,  28, 711, 294, 303, 264,   5, 289},
                {581, 401,   1, 566, 754, 329, 744, 876, 592,  62, 387, 276, 799,  17, 824, 301, 489, 963, 262, 308, 138, 483,   9},
                {368, 616, 578, 867, 860,  73, 493, 240, 924, 107, 834, 254,  76, 581,  84, 974, 443,  48, 828, 630, 309, 589, 494},
                { 18, 469, 128, 462, 274, 449, 280, 198,  69, 990, 770, 755, 865, 642, 698, 601, 553,  50, 752,  96, 614,  57, 848},
            },
            {
                {758,  46, 124, 129, 960,  64, 624, 236, 388, 627, 735, 554, 532, 261, 826, 163, 410, 853, 583, 260, 279, 418, 990},
                {912,  57, 685, 425, 601,  73, 798, 394, 701, 174, 366, 359, 227, 981, 821, 393, 985, 370, 609, 886, 109, 418, 738},
                {168, 702,  34, 582, 292, 546, 588, 575, 135, 661, 134, 953, 463, 236, 705, 748,  36, 869, 650, 945, 172, 404, 853},
                {246, 462, 130,  30, 293, 200, 604, 269, 635, 490, 494, 926, 796, 301, 676, 760, 393, 695, 516, 526,  32, 893, 144},
                {637, 824, 236, 712, 737, 335, 911, 924, 402, 903, 556, 395, 903,  30, 266, 334, 871, 156, 659, 740, 768, 621, 458},
                {283, 691,  67, 455, 101, 611, 438,  95, 635, 442, 868,  43,   6,  99, 502, 373, 522, 271, 791, 602, 668, 357, 435},
                { 81, 725, 818, 361, 289, 246, 244, 164, 213, 237, 120, 796, 146, 912, 290, 775, 933, 938, 913, 826, 285, 946, 873},
                {198, 296, 717, 294, 315, 701, 705,  39, 932, 172,  79, 718, 100, 406, 261, 345, 917, 613, 739, 134, 609, 685, 792},
            },
        };

        for (int stranka = 0;  stranka < volitve[0].length;  stranka++) {
            System.out.println(Volitve.najVolisce(volitve, stranka));
        }
    }
}
