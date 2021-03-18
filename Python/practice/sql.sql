select p.player_name 선수명, t.team_name 팀명
from player p, team team
where p.team_id = t.team_id
and p.position = 'GK'
order by p.back_no;

select position 포지션, round(avg(height), 2) 평균키
from player
group by position
having avg(height) >= 180;

select nvl(MGR, 9999) mgr from emp where ename = 'KING';
-- king인 사람의 매니저 직책이 null이면 9999 출력

select nvl(max(mgr), 9999) mgr from emp where ename = 'JSC';
-- max라는 집계로 공집합을 null로 바꾸고 nvl 함수에 넣었다.
-- 공집합이 있을 경우 집계로 null로 바꾸고 nvl

select ename,
case when sal > 2000
then sal
else 2000
end revised_salary
from emp;
-- sal이 2000 넘으면 그냥 sal 값으로, 아니면 2000으로 컬럼명을 revised_salay로 표기

to_number, to_char;

select ename, hiredate,
to_number(to_char(hiredate, 'YYYY')) 입사년도,
to_number(to_char(hiredate, 'MM')) 입사월
from emp;

select e.ename 사원명, s.grade 급여등급
from emp e, salgrade sal
where e.sal between s.losal and s.hisal;

select ename, sal
from (select ename, sal from emp order by sal desc)
where rownum < 4;

select DDD || TE as tel
from stadium;

select ename, job, deptno
from emp
where (job, deptno) in (('manager, 20'), ('clerk', 30));

select extract('year' from hiredate) 입사월
from emp;