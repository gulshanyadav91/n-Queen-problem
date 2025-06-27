The N-Queens Problem is a classic backtracking problem where we are asked to place N queens on an N×N chessboard such that:

No two queens attack each other.

This means:

Only one queen per row

Only one queen per column

No two queens should share the same diagonal.

🔐 Safety Check (isSafe function)
To determine if placing a queen at board[row][col] is safe:

Check vertical up (same column).

Check diagonal left up (↖).

Check diagonal right up (↗).
