cat .config |grep -E "^CONFIG_"  | sort  >1 && cat ../dsc-team-dsc-team-kernel-project-hunderteins/.config |grep -E "^CONFIG_"  | sort  >2 && diff -Nruw 2 1 |grep -e "^-CONFIG"  > config-minuses 
rm 1 2 
