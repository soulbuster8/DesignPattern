CURRENT_TIME=(`date +%s`)
FILENAME=$(git rev-parse --abbrev-ref HEAD) # git branch
BRANCH_DOCS_DIR="./branch-docs/"
touch "$BRANCH_DOCS_DIR$CURRENT_TIME-$FILENAME.md"
