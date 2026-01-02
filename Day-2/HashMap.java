HashMap<Integer, Integer> mao = new HashMap<>();
for (int x : arr)
{
    map.put(x, map.getOrDefault(x,0)+1);
}