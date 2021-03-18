def dfs(v):
    print(v, end = " ")
    visited[v] = True
    for e in adj[v]:
        if not visited[e]:
            dfs(e)

def bsf(v):
    q = deque([v])

    while q:
        v = q.popleft()
        if not visited[v]:
            visited[v] = True
            print(v, end = " ")
            for e in adj[v]:
                if not visited[e]:
                    q.append(e)

def bsf(v):
    q = deque([v])
    while a:
        v = q.popleft()
        if not visited[v]:
            visited[v] = True
            print(v, end = " ")
            for e in adj[v]:
                if not visited[e]:
                    q.append(e)