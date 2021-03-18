select p.player_name ������, t.team_name ����
from player p, team team
where p.team_id = t.team_id
and p.position = 'GK'
order by p.back_no;

select position ������, round(avg(height), 2) ���Ű
from player
group by position
having avg(height) >= 180;

select nvl(MGR, 9999) mgr from emp where ename = 'KING';
-- king�� ����� �Ŵ��� ��å�� null�̸� 9999 ���

select nvl(max(mgr), 9999) mgr from emp where ename = 'JSC';
-- max��� ����� �������� null�� �ٲٰ� nvl �Լ��� �־���.
-- �������� ���� ��� ����� null�� �ٲٰ� nvl

select ename,
case when sal > 2000
then sal
else 2000
end revised_salary
from emp;
-- sal�� 2000 ������ �׳� sal ������, �ƴϸ� 2000���� �÷����� revised_salay�� ǥ��

to_number, to_char;

select ename, hiredate,
to_number(to_char(hiredate, 'YYYY')) �Ի�⵵,
to_number(to_char(hiredate, 'MM')) �Ի��
from emp;

select e.ename �����, s.grade �޿����
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

select extract('year' from hiredate) �Ի��
from emp;